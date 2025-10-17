package Commands;

import Implementations.FileSystemReceiver;

public class CopyFileCommand implements ICommand {
    private final FileSystemReceiver fileSystemReceiver;
    private final String sourceFile;
    private final String destinationFile;
    
    public CopyFileCommand(FileSystemReceiver receiver, String source, String dest){
        this.fileSystemReceiver = receiver;
        this.sourceFile = source;
        this.destinationFile = dest;
    }

    @Override
    public void execute() {
        fileSystemReceiver.copyFile(sourceFile, destinationFile);
    }

    @Override
    public void undo() {
        fileSystemReceiver.deleteFile(destinationFile);
    }
}
