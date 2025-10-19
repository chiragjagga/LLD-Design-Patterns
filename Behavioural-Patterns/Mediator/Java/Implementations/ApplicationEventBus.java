package Implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interfaces.EventMediator;
import Interfaces.Subscriber;

public class ApplicationEventBus implements EventMediator {
    private final Map<Class<?>, List<Subscriber>> subscribers = new HashMap<>();

    @Override
    public void publish(Object event) {
        Class<?> eventType = event.getClass();
        System.out.println("\nEVENT_BUS: Publishing event: " + eventType.getSimpleName());
        
        if (subscribers.containsKey(eventType)) {
            for (Subscriber subscriber : subscribers.get(eventType)) {
                System.out.println(" > Notifying subscriber: " + subscriber.getName());
                subscriber.onEvent(event);
            }
        } else {
            System.out.println(" > No subscribers for this event.");
        }
    }

    @Override
    public void subscribe(Subscriber subscriber, Class<?> eventType) {
        List<Subscriber> eventSubscribers = subscribers.computeIfAbsent(eventType, k -> new ArrayList<>());
        eventSubscribers.add(subscriber);
        System.out.println("EVENT_BUS: " + subscriber.getName() + " has subscribed to " + eventType.getSimpleName());
    }
    
}
