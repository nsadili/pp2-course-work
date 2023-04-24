package pp2.week12;
import java.io.File;
public class FileSystemTraversal {
    public static void printFileInfo(String fileInfo) {
        File file = new File(fileInfo);
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Length: " + file.length() );
        }
        else {
            System.out.println("Error");
        }
    }

    public static void traverseFile(String fileInfo) {
        File file = new File(fileInfo);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());

        } else {
            System.out.println("File: " + file.getAbsolutePath());
            printFileInfo(file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        String fileInfo = "/Users/Lenovo/";
        traverseFile(fileInfo);
    }
}