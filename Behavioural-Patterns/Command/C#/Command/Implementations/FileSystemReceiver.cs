public class FileSystemReceiver {
        public void createDirectory(String path) {
        Console.WriteLine("EXECUTING: Creating directory at " + path);
    }

    public void deleteDirectory(String path) {
        Console.WriteLine("   UNDOING: Deleting directory at " + path);
    }

    public void copyFile(String source, String dest) {
        Console.WriteLine("EXECUTING: Copying '" + source + "' to '" + dest + "'");
    }

    public void deleteFile(String dest) {
        Console.WriteLine("   UNDOING: Deleting file at '" + dest + "'");
    }
    
    public void createShortcut(String shortcutPath, String targetFile) {
        Console.WriteLine("EXECUTING: Creating shortcut at '" + shortcutPath + "'");
    }
    
    public void deleteShortcut(String shortcutPath) {
        Console.WriteLine("   UNDOING: Deleting shortcut at '" + shortcutPath + "'");
    }
    
    public void createConfigFile(String path) {
        Console.WriteLine("EXECUTING: Creating config file '" + path + "'");
        throw new Exception("Permission denied! Cannot write config file.");
    }
}
