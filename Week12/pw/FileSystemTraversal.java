import java.io.File;
import java.util.Date;

public class FileSystemTraversal{
    public static void printFileInfo(String path) {
        File file = new File(path);
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Parent directory: " + file.getParent());
        System.out.println("Exists: " + file.exists());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is hidden: " + file.isHidden());
        System.out.println("Last modified: " + new Date(file.lastModified()));
        System.out.println("Length: " + file.length());
     }
     
     public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isFile()) {
           printFileInfo(path);
        } else if (file.isDirectory()) {
           File[] files = file.listFiles();
           for (File f : files) {
              traverseFileSystem(f.getPath());
           }
        }
     }
}

