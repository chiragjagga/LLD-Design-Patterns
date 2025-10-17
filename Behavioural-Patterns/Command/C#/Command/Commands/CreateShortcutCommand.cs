public class CreateShortcutCommand : ICommand {
    private readonly FileSystemReceiver fileSystemReceiver;
    private readonly String shortCutPath;
    private readonly String targetFile;

    public CreateShortcutCommand(FileSystemReceiver receiver, String shortcutPath, String targetFile){
        this.fileSystemReceiver = receiver;
        this.shortCutPath = shortcutPath;
        this.targetFile = targetFile;
    }

    public void execute() {
        fileSystemReceiver.createShortcut(shortCutPath, targetFile);
    }

    public void undo() {
        fileSystemReceiver.deleteShortcut(shortCutPath);
    }
}
