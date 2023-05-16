package Week12;
import java.io.File;
import java.io.IOException;
public class CreateingFile {
    public static void main(String[] args) {
        String path = "Week12/";
        File f = new File(path);
        if (f.exists()) {
            System.out.println("File/Folder exists: " + f.exists());
            System.out.println("It can be a File: " + f.isFile());
            System.out.println("It can be  a directory: " + f.isDirectory());
            System.out.println("It can be read: " + f.canRead());
            System.out.println("It can be written: " + f.canWrite());
        } else {
            try {
                if (path.contains(".") && f.createNewFile()) {
                    System.out.println("Created File");
                    System.out.println("Path: " + f.getAbsolutePath());
                }
                else if (!path.contains(".") && f.mkdirs()) {
                    System.out.println("Created Folder");
                    System.out.println("Path: " + f.getAbsolutePath());
                }
                else
                    System.out.println("Unlucky attempt");
            }
            catch (IOException e) {
                System.out.println("Message: " + e);
            }
        }
    }
}
