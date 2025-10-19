public interface Subscriber {
    void onEvent(Object ev);
    String getName();
}
