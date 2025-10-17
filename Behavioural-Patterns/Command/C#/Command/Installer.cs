public class Installer {
    private readonly List<ICommand> commands = new List<ICommand>();
    private readonly Stack<ICommand> commandsHistory = new Stack<ICommand>();

    public void addCommand(ICommand command){
        commands.Add(command);
    }

    public void install(){
        Console.WriteLine("--- Starting Installation ---");
        try {
            foreach (ICommand command in commands) {
                command.execute();
                commandsHistory.Push(command);
            }
            Console.WriteLine("\n--- Installation Completed Successfully! ---");
        } catch (Exception e) {
            Console.WriteLine("\n*** ERROR: Installation failed. Reason: " + e.Message + " ***");
            rollback();
        }
    }

    private void rollback() {
        Console.WriteLine("\n--- Starting Rollback ---");
        while (commandsHistory.Count > 0) {
            ICommand lastCommand = commandsHistory.Pop();
            lastCommand.undo();
        }
        Console.WriteLine("--- Rollback Complete. System is in its original state. ---");
    }  
}
