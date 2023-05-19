
    import java.io.File;

public class FileSystemTraversal {
    public static void printFileInfo(String path) {
        File file = new File(path);

        if (file.exists()) {
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Name: " + file.getName());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File or directory does not exist.");
        }
    }
}


