package Week12;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileSystemTraversal1 {
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Size: " + file.length() + " bytes");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Last modified: " + sdf.format(file.lastModified()));
        } else {
            System.out.println("File/directory does not exist.");
        }
    }
}
