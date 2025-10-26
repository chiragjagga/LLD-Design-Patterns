import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import Implementations.CustomButton;
import Implementations.LogObserver;

import java.awt.BorderLayout;

public class Observer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui(){
        JFrame frame = new JFrame("GUI Manual Observer Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout(10, 10));

        CustomButton saveButton = new CustomButton("Save File");
        CustomButton loadButton = new CustomButton("Load Button");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);

        JTextArea logArea = new JTextArea();
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);

        LogObserver logger = new LogObserver(logArea);

        System.out.println("Subscribing the LogObserver from our custom buttons");
        saveButton.subscribe(logger);
        loadButton.subscribe(logger);

        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
