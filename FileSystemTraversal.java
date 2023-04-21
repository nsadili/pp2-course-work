package Week12;


import java.io.File;

public class FileSystemTraversal {

    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println();
        } else {
            System.out.println("File/directory not found.");
        }
    }

    public static void traverseFileSystem(String path) {
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

    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop";
        traverseFileSystem(path);
    }
}
