package Commands;

import Implementations.FileSystemReceiver;

public class CreateConfigCommand implements ICommand {

    private final FileSystemReceiver fileSystemReceiver;
    private final String configPath;

    public CreateConfigCommand(FileSystemReceiver receiver, String configFilePath){
        this.configPath = configFilePath;
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() throws Exception {
        fileSystemReceiver.createConfigFile(configPath);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }
    
}
