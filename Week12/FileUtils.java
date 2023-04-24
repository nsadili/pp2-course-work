package exceptions;

import java.io.*;

public class FileUtils {

    public static void printFileInfo(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("The specified file/directory does not exist.");
            return;
        }
        if (file.isDirectory()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Directory: Yes");
            System.out.println("Size: " + getFileSize(file));
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Directory: No");
            System.out.println("Size: " + getFileSize(file));
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        }
    }

    public static void printDirectoryInfo(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("The specified directory does not exist.");
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println("The specified path is not a directory.");
            return;
        }
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                printDirectoryInfo(file.getAbsolutePath());
            } else {
                printFileInfo(file.getAbsolutePath());
            }
        }
    }

    private static String getFileSize(File file) {
        long sizeInBytes = file.length();
        long sizeInKB = sizeInBytes / 1024;
        long sizeInMB = sizeInKB / 1024;
        if (sizeInMB > 0) {
            return sizeInMB + " MB";
        } else if (sizeInKB > 0) {
            return sizeInKB + " KB";
        } else {
            return sizeInBytes + " bytes";
        }
    }

}
