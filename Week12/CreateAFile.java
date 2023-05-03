package week12codes;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
        String path = "Week12/";
        File file = new File(path);
        if (file.exists()) {
            System.out.printf("File/Folder exists: %b%nIs it a file: %b%nIs it a directory: %b%nIs it readable: %b%nIs it writable: %b%n",
                file.exists(), file.isFile(), file.isDirectory(), file.canRead(), file.canWrite());
        } else {
            try {
                if (path.contains(".") && file.createNewFile()) {
                    System.out.println("File created successfully!");
                    System.out.println("Path: " + file.getAbsolutePath());
                } else if (!path.contains(".") && file.mkdirs()) {
                    System.out.println("Folder created successfully!");
                    System.out.println("Path: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create the file!");
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}