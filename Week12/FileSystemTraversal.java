package Week12;

import java.io.File;

public class FileSystemTraversal {
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
        } else {
            System.out.println("File/directory does not exist.");
        }
    }

    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
            for (File subFile : file.listFiles()) {
                traverseFileSystem(subFile.getAbsolutePath());
            }
        } else {
            printFileInfo(path);
        }
    }

    public static void main(String[] args) {
        String path = "path/to/file/or/directory";
        traverseFileSystem(path);
    }
}
