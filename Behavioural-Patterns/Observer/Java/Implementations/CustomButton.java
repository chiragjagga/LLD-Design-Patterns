package Implementations;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import Interfaces.Observer;
import Interfaces.Subject;

public class CustomButton extends JButton implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    public CustomButton(String text){
        super(text);

        this.addActionListener(e -> notifySubscribers());
    }


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("Button '" + getText() + "' was clicked. Notifying " + observers.size() + " custom observers.");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
