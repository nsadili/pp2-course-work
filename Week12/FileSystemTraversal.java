import java.io.File;

public class FileSystemTraversal {

    public static void main(String[] args) {
        String path = "C:/Users/username/Desktop";
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                traverseDirectory(file);
            } else {
                printFileInfo(file);
            }
        } else {
            System.out.println("File or directory not found.");
        }
    }

    public static void traverseDirectory(File directory) {
        System.out.println("Directory: " + directory.getAbsolutePath());
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traverseDirectory(file);
                } else {
                    printFileInfo(file);
                }
            }
        }
    }

    public static void printFileInfo(File file) {
        System.out.println("File: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
        System.out.println("Hidden: " + file.isHidden());
        System.out.println();
    }
}
