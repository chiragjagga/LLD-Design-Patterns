package Implementations;

public class FileSystemReceiver {
        public void createDirectory(String path) {
        System.out.println("EXECUTING: Creating directory at " + path);
    }

    public void deleteDirectory(String path) {
        System.out.println("   UNDOING: Deleting directory at " + path);
    }

    public void copyFile(String source, String dest) {
        System.out.println("EXECUTING: Copying '" + source + "' to '" + dest + "'");
    }

    public void deleteFile(String dest) {
        System.out.println("   UNDOING: Deleting file at '" + dest + "'");
    }
    
    public void createShortcut(String shortcutPath, String targetFile) {
        System.out.println("EXECUTING: Creating shortcut at '" + shortcutPath + "'");
    }
    
    public void deleteShortcut(String shortcutPath) {
        System.out.println("   UNDOING: Deleting shortcut at '" + shortcutPath + "'");
    }
    
    public void createConfigFile(String path) throws Exception {
        System.out.println("EXECUTING: Creating config file '" + path + "'");
        throw new Exception("Permission denied! Cannot write config file.");
    }
}
