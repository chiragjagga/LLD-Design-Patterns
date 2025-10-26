using System.Drawing;
using System.Windows.Forms;

namespace Observer;

public partial class MainForm : Form
{
    public MainForm()
    {
        InitializeComponent();

        this.Text = "C# Manual Observer Demo";
        this.Size = new Size(500, 300);

        CustomButton saveButton = new CustomButton
        {
            Text = "Save File",
            Location = new Point(10, 10)
        };

        CustomButton loadButton = new CustomButton
        {
            Text = "Load File",
            Location = new Point(90, 10)
        };
            
        FlowLayoutPanel buttonPanel = new FlowLayoutPanel
        {
            Dock = DockStyle.Top,
            Height = 40
        };
        buttonPanel.Controls.Add(saveButton);
        buttonPanel.Controls.Add(loadButton);

        TextBox logArea = new TextBox
        {
            Dock = DockStyle.Fill,
            Multiline = true,
            ReadOnly = true,
            ScrollBars = ScrollBars.Vertical
        };

        LogObserver logger = new LogObserver(logArea);

        Console.WriteLine("Subscribing the LogObserver from our custom buttons...");
        saveButton.Subscribe(logger);
        loadButton.Subscribe(logger);

        this.Controls.Add(logArea);
        this.Controls.Add(buttonPanel);
    }
}
