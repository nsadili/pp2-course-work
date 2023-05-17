package Week12;

import java.io.File;

public class FileSystemTraversal2 {
    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getPath());
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    traverseFileSystem(subFile.getPath());
                }
            }
        } else {
            printFileInfo(file.getPath());
        }
    }

    private static void printFileInfo(String path) {
    }
}
