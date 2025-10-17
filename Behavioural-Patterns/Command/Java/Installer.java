import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import Commands.ICommand;

public class Installer {
    private final List<ICommand> commands = new ArrayList<>();
    private final Deque<ICommand> commandsHistory = new ArrayDeque<>();

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void install(){
        System.out.println("--- Starting Installation ---");
        try {
            for (ICommand command : commands) {
                command.execute();
                commandsHistory.push(command);
            }
            System.out.println("\n--- Installation Completed Successfully! ---");
        } catch (Exception e) {
            System.err.println("\n*** ERROR: Installation failed. Reason: " + e.getMessage() + " ***");
            rollback();
        }
    }

    private void rollback() {
        System.out.println("\n--- Starting Rollback ---");
        while (!commandsHistory.isEmpty()) {
            ICommand lastCommand = commandsHistory.pop();
            lastCommand.undo();
        }
        System.out.println("--- Rollback Complete. System is in its original state. ---");
    }  
}
