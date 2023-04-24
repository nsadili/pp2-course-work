import java.io.File;
import java.util.Date;

public class FileInfo {
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Is Directory? " + file.isDirectory());
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}
