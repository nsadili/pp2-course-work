package Week12;

import java.io.File;
import java.util.Date;

public class FileSystemTraversal {

    public static void main(String[] args) {
        String path = "/path/to/file/or/directory";
        traverseFileSystem(path);
    }

    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + new Date(file.lastModified()));
            if (file.isDirectory()) {
                System.out.println("Type: Directory");
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        traverseFileSystem(f.getAbsolutePath());
                    }
                }
            } else {
                System.out.println("Type: File");
            }
        } else {
            System.out.println("File/directory not found.");
        }
    }
}

