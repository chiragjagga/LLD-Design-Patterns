package Commands;

import Implementations.FileSystemReceiver;

public class CreateDirectoryCommand implements ICommand {
    private final FileSystemReceiver fileSystemReceiver;
    private final String directoryPath;

    public CreateDirectoryCommand(FileSystemReceiver receiver, String directoryPath){
        this.fileSystemReceiver = receiver;
        this.directoryPath = directoryPath;
    }

    @Override
    public void execute() {
        fileSystemReceiver.createDirectory(directoryPath);
    }

    @Override
    public void undo() {
        fileSystemReceiver.deleteDirectory(directoryPath);
    }
}
