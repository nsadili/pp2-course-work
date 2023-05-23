package Week12;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String path = "Week12/";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File/Folder exists: " + file.exists());
            System.out.println("Is it a file: " + file.isFile());
            System.out.println("Is it a directory: " + file.isDirectory());
            System.out.println("Is it readable: " + file.canRead());
            System.out.println("Is it writable: " + file.canWrite());
        } else {
            try {
                if (path.contains(".") && file.createNewFile()) {
                    System.out.println("File created successfully!");
                    System.out.println("Path: " + file.getAbsolutePath());
                }
                else if (!path.contains(".") && file.mkdirs()) {
                    System.out.println("Folder created successfully!");
                    System.out.println("Path: " + file.getAbsolutePath());
                }
                else
                    System.out.println("Failed to create the file!");
            }
            catch (IOException e) {
                System.out.println("Message: " + e);
            }
        }
    }
}