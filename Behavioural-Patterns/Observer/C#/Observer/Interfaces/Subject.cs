public interface Subject {
    void Subscribe(IObserver observer);
    void Unsubscribe(IObserver observer);
    void NotifySubscribers();
}
