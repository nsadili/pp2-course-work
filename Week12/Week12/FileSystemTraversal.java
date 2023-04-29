package Week12;

import java.io.*;

public class FileSystemTraversal {
    
    // Method to print information about a file/directory
    public static void printFileInfo(File file) {
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        if (file.isDirectory()) {
            System.out.println("Type: Directory");
        } else {
            System.out.println("Type: File");
        }
        System.out.println();
    }
    
    // Method to recursively traverse a file system
    public static void traverseFileSystem(File file) {
        if (file.isFile()) {
            // If file is a file, print information about it
            printFileInfo(file);
        } else if (file.isDirectory()) {
            // If file is a directory, recursively traverse all subdirectories and files
            System.out.println("Directory: " + file.getPath());
            File[] subFiles = file.listFiles();
            if (subFiles != null) {
                for (File subFile : subFiles) {
                    traverseFileSystem(subFile);
                }
            }
        }
    }
    
    // Main method to test the implementation
    public static void main(String[] args) {
        // Provide path to file/directory to traverse
        File file = new File("C:\\Users\\User\\Documents");
        traverseFileSystem(file);
    }
}
