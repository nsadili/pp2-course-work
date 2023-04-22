package Ex7;

import java.io.File;
import java.util.Date;

public class FileSystemTraverse {
    
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File/directory does not exist.");
        }
    }
    
    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
            File[] files = file.listFiles();
            for (File subFile : files) {
                traverseFileSystem(subFile.getAbsolutePath());
            }
        } else {
            System.out.println("File: " + file.getAbsolutePath());
            printFileInfo(file.getAbsolutePath());
        }
    }
    
    public static void main(String[] args) {
        String path = "/Users/raqli/Desktop/";
        traverseFileSystem(path);
    }
}
