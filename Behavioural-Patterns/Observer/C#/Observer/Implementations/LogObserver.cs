using System;
using System.Windows.Forms;

public class LogObserver : IObserver {

    private readonly TextBox logArea;

    public LogObserver(TextBox jTextArea) {
        this.logArea = jTextArea;
    }

    public void Update(Subject source) {
        if (source is CustomButton button) {
            String buttonText = button.Text;
            String timeStamp = DateTime.Now.ToString("HH:mm:ss");

            logArea.AppendText($"[{timeStamp}] Received notification from: '{buttonText}' button.{Environment.NewLine}");
        }
    }

}
