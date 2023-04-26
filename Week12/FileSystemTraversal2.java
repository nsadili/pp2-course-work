import java.io.File;

public class FileSystemTraversal2 extends FileSystemTraversal{
    public static void traverseDirectory(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
            File[] files = file.listFiles();

            if (files != null) {
                for (File subFile : files) {
                    traverseDirectory(subFile.getAbsolutePath());
                }
            }
        } else {
            System.out.println("File: " + file.getAbsolutePath());
            printFileInfo(file.getAbsolutePath());
        }
    }
}
