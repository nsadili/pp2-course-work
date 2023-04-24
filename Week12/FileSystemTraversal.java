package week12;
import java.io.File;

public class FileSystemTraversal {

    public static void main(String[] args) {
        String path = "directory/or/file";
        traverseFileSystem(path);
    }

    private static void traverseFileSystem(String path) {
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("does not exist.");
            return;
        }

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.lastModified());

        if (file.isFile()) {
            System.out.println(file.length());
        } else {
            File[] files = file.listFiles();
            for (File subFile : files) {
                traverseFileSystem(subFile.getPath());
            }
        }
    }
}
