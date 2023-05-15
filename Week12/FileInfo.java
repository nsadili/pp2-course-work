package Week12;

import java.io.*;

public class FileInfo {

    public static void printFileInfo(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println(" does not exist.");
            return;
        }
        System.out.println(" name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        if (file.isDirectory()) {
            System.out.println("Type: Directory");
            System.out.println("Number of files: " + file.list().length);
        } else {
            System.out.println("Type: File");
            System.out.println(" size: " + file.length() + " bytes");
        }
    }

    public static void printDirInfoRecursive(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println(" does not exist.");
            return;
        }
        if (file.isDirectory()) {
            System.out.println(" name: " + file.getName());
            File[] files = file.listFiles();
            for (File f : files) {
                printDirInfoRecursive(f.getAbsolutePath());
            }
        } else {
            System.out.println(" name: " + file.getName());
            printFileInfo(file.getAbsolutePath());
        }
    }
}
