import java.io.File;

public class FileSystemTraversal {
    public static void traverseFileSystem(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File subFile : files) {
                        traverseFileSystem(subFile.getAbsolutePath());
                    }
                }
            } else {
                FileInfo.printFileInfo(path);
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}
