import java.io.File;

public class FileSystemTraversal {

    public static void main(String[] args) {
        String path = "/pp2-course-work/Week12/assignment7/";
        printFileInfo(path);
        traverseDirectory(path);
    }

    private static void printFileInfo(String path) {
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("\nFile Name: " + file.getName());
            System.out.println("\nAbsolute Path: " + file.getAbsolutePath());
            System.out.println("\nSize: " + file.length() + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("\nDirectory Name: " + file.getName());
            System.out.println("\nAbsolute Path: " + file.getAbsolutePath());
        } else {
            System.out.println("\nInvalid Path\n");
        }
    }

    private static void traverseDirectory(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("\nSubdirectories and Files:");
            File[] files = file.listFiles();
            for (File f : files) {
                printFileInfo(f.getAbsolutePath());
                traverseDirectory(f.getAbsolutePath());
            }
        }
    }
}
