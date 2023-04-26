import java.io.File;

public class FileSystemTraversal {
    public static void printFileInfo(String path) {
        File file = new File(path);

        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length());
        System.out.println("Last modified: " + file.lastModified());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("Is file? " + file.isFile());
    }
}
