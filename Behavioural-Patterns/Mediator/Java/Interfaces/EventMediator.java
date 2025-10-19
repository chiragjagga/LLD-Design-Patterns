package Interfaces;

public interface EventMediator {
    void publish(Object event);

    void subscribe(Subscriber subscriber, Class<?> eventType);
}