package Commands;

import Implementations.FileSystemReceiver;

public class CreateShortcutCommand implements ICommand {
    private final FileSystemReceiver fileSystemReceiver;
    private final String shortCutPath;
    private final String targetFile;

    public CreateShortcutCommand(FileSystemReceiver receiver, String shortcutPath, String targetFile){
        this.fileSystemReceiver = receiver;
        this.shortCutPath = shortcutPath;
        this.targetFile = targetFile;
    }

    @Override
    public void execute() {
        fileSystemReceiver.createShortcut(shortCutPath, targetFile);
    }

    @Override
    public void undo() {
        fileSystemReceiver.deleteShortcut(shortCutPath);
    }
}
