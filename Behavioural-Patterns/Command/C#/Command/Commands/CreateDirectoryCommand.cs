public class CreateDirectoryCommand : ICommand {
    private readonly FileSystemReceiver fileSystemReceiver;
    private readonly String directoryPath;

    public CreateDirectoryCommand(FileSystemReceiver receiver, String directoryPath){
        this.fileSystemReceiver = receiver;
        this.directoryPath = directoryPath;
    }

    public void execute() {
        fileSystemReceiver.createDirectory(directoryPath);
    }

    public void undo() {
        fileSystemReceiver.deleteDirectory(directoryPath);
    }
}
