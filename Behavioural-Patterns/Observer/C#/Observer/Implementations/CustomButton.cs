using System;
using System.Collections.Generic;
using System.Windows.Forms;

public class CustomButton : Button, Subject {
    private readonly List<IObserver> observers = new List<IObserver>();

    public CustomButton()
    {
        this.Click += OnButtonClicked;
    }
    
    private void OnButtonClicked(object sender, EventArgs e)
    {
        NotifySubscribers();
    }

    public void Subscribe(IObserver observer) {
        observers.Add(observer);
    }

    public void Unsubscribe(IObserver observer) {
        observers.Remove(observer);
    }

    public void NotifySubscribers() {
        Console.WriteLine($"Button {this.Text} was clicked. Notifying {observers.Count} custom observers.");
        foreach (IObserver observer in observers) {
            observer.Update(this);
        }
    }
}
