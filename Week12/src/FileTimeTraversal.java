import java.io.File;
import java.util.Date;

public class FileTimeTraversal {

    // method to print information about a file/directory
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            if (file.isFile()) {
                System.out.println("Size: " + file.length() + " bytes");
                System.out.println("Last modified: " + new Date(file.lastModified()));
            } else if (file.isDirectory()) {
                System.out.println("Type: Directory");
                System.out.println("Contains: " + file.list().length + " files/folders");
            }
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }

    // method to print information about a file/directory recursively
    public static void printAllFileInfo(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
            File[] files = file.listFiles();
            for (File f : files) {
                printAllFileInfo(f.getAbsolutePath());
            }
        } else if (file.isFile()) {
            printFileInfo(path);
        }
    }

    public static void main(String[] args) {
        printFileInfo("test.txt");
        printAllFileInfo("/Users/user/Desktop");
    }
}
