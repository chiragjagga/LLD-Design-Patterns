package Commands;

public interface ICommand {
    public void execute() throws Exception;
    public void undo();
}
