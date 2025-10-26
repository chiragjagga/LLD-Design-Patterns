package Implementations;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextArea;

import Interfaces.Observer;
import Interfaces.Subject;

public class LogObserver implements Observer {

    private final JTextArea logArea;

    public LogObserver(JTextArea jTextArea){
        this.logArea = jTextArea;
    }

    @Override
    public void update(Subject source) {
        if (source instanceof CustomButton) {
            CustomButton button = (CustomButton) source;
            String buttonText = button.getText();
            String timeStamp = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            
            logArea.append("[" + timeStamp + "] Received notification from: '" + buttonText + "' button.\n");
        }
    }
    
}
