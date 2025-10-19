public interface EventMediator {
    void publish(Object ev);

    void subscribe(Subscriber subscriber, Type eventType);
}