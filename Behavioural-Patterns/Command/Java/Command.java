import Commands.CopyFileCommand;
import Commands.CreateConfigCommand;
import Commands.CreateDirectoryCommand;
import Commands.CreateShortcutCommand;
import Implementations.FileSystemReceiver;

public class Command {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = new FileSystemReceiver();

        String installPath = "InstallPath";
        String shortCutPath = "ShortCutPath";

        //Successful installation
        Installer successfulInstaller = new Installer();
        successfulInstaller.addCommand(new CreateDirectoryCommand(fileSystemReceiver, installPath));
        successfulInstaller.addCommand(new CopyFileCommand(fileSystemReceiver, "installer/app.exe", installPath + "/app.exe"));
        successfulInstaller.addCommand(new CopyFileCommand(fileSystemReceiver, "installer/lib.dll", installPath + "/lib.dll"));
        successfulInstaller.addCommand(new CreateShortcutCommand(fileSystemReceiver, shortCutPath, installPath + "/app.exe"));

        successfulInstaller.install();

        //Failed installation
        Installer failingInstaller = new Installer();
        failingInstaller.addCommand(new CreateDirectoryCommand(fileSystemReceiver, installPath));
        failingInstaller.addCommand(new CopyFileCommand(fileSystemReceiver, "installer/app.exe", installPath + "/app.exe"));
        failingInstaller.addCommand(new CreateConfigCommand(fileSystemReceiver, installPath + "/config.ini")); 
        failingInstaller.addCommand(new CreateShortcutCommand(fileSystemReceiver, shortCutPath, installPath + "/app.exe"));

        failingInstaller.install();
    }
}
