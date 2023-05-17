package Week12;

import java.io.File;

public class FileSystemTraversal {
    public static void main(String[] args) {
        String path = "/path/to/directory";

        printFileInfo(path);
        traverseFileSystem(path);
    }

    private static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println();
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());

            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    traverseFileSystem(subFile.getAbsolutePath());
                }
            }
        } else {
            printFileInfo(path);
        }
    }
}
