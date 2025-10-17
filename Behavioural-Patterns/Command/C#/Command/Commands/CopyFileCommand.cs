public class CopyFileCommand : ICommand {
    private readonly FileSystemReceiver fileSystemReceiver;
    private readonly String sourceFile;
    private readonly String destinationFile;
    
    public CopyFileCommand(FileSystemReceiver receiver, String source, String dest){
        this.fileSystemReceiver = receiver;
        this.sourceFile = source;
        this.destinationFile = dest;
    }

    public void execute()
    {
        fileSystemReceiver.copyFile(sourceFile, destinationFile);
    }
    
    public void undo() {
        fileSystemReceiver.deleteFile(destinationFile);
    }
}
