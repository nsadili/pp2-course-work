import java.io.File;

public class FileSystemTraversal {

    public static void printFileInfo(String path) {
        File file = new File(path);
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last modified: " + file.lastModified());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is file: " + file.isFile());
        System.out.println("---------------------------");
    }

    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isFile()) {
            printFileInfo(file.getPath());
        } else if (file.isDirectory()) {
            printFileInfo(file.getPath());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    traverseFileSystem(f.getPath());
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "/pp2-course-work/Week12/PW/assignment3";
        traverseFileSystem(path);
    }
}
