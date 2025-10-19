public class ApplicationEventBus : EventMediator {
    private readonly IDictionary<Type, List<Subscriber>> subscribers = new Dictionary<Type, List<Subscriber>>();

    public void publish(Object ev) {
        Type eventType = ev.GetType();
        Console.WriteLine("\nEVENT_BUS: Publishing event: " + eventType.Name);
        
        if (subscribers.TryGetValue(eventType, out List<Subscriber>? eventSubscribers)) {
            foreach (var subscriber in eventSubscribers) {
                Console.WriteLine(" > Notifying subscriber: " + subscriber.getName());
                subscriber.onEvent(ev);
            }
        } else {
            Console.WriteLine(" > No subscribers for this event.");
        }
    }

    public void subscribe(Subscriber subscriber,Type eventType) {
        if (!subscribers.ContainsKey(eventType))
        {
            subscribers[eventType] = new List<Subscriber>();
        }
        subscribers[eventType].Add(subscriber);
        Console.WriteLine("EVENT_BUS: " + subscriber.getName() + " has subscribed to " + eventType.Name);
    }
    
}
