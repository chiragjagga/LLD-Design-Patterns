package Interfaces;

public interface Subscriber {
    void onEvent(Object event);
    String getName();
}
