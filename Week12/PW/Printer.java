package PW;

import java.io.*;

public class Printer {
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Hidden: " + file.isHidden());
            System.out.println();
        } else {
            System.out.println("File/directory not found.");
        }
    }

    public static void printDirectoryInfoRecursively(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    printDirectoryInfoRecursively(subFile.getAbsolutePath());
                }
            }
        } else if (file.isFile()) {
            System.out.println("File: " + file.getName());
            printFileInfo(file.getAbsolutePath());
        } else {
            System.out.println("File/directory not found.");
        }
    }

    public static void main(String[] args) {
        String path = "/path/to/file/or/directory";
        printDirectoryInfoRecursively(path);
    }
}

