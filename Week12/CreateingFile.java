package Week12;
import java.io.File;
import java.io.IOException;
public class CreateingFile {
    public static void main(String[] args) {
        String path = "Week12/";
        File f = new File(path);
        if (f.exists()) {
            System.out.println("File/Folder exists: " + f.exists());
            System.out.println("Is it a f: " + f.isFile());
            System.out.println("Is it a directory: " + f.isDirectory());
            System.out.println("Is it readable: " + f.canRead());
            System.out.println("Is it writable: " + f.canWrite());
        } else {
            try {
                if (path.contains(".") && f.createNewFile()) {
                    System.out.println("File created successfully!");
                    System.out.println("Path: " + f.getAbsolutePath());
                }
                else if (!path.contains(".") && f.mkdirs()) {
                    System.out.println("Folder created successfully!");
                    System.out.println("Path: " + f.getAbsolutePath());
                }
                else
                    System.out.println("Failed to create the f!");
            }
            catch (IOException e) {
                System.out.println("Message: " + e);
            }
        }
    }
}
