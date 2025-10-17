public class CreateConfigCommand : ICommand {

    private readonly FileSystemReceiver fileSystemReceiver;
    private readonly String configPath;

    public CreateConfigCommand(FileSystemReceiver receiver, String configFilePath){
        this.configPath = configFilePath;
        this.fileSystemReceiver = receiver;
    }

    public void execute(){
        fileSystemReceiver.createConfigFile(configPath);
    }

    public void undo() {
        throw new Exception("Unimplemented method 'undo'");
    }
    
}
