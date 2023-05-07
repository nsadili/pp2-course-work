import java.io.File;
import java.util.Date;

public class FileSystemTraverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path!");
            return;
        }

        String filePath = args[0]; // first argument from command line

        File rootFile = new File(filePath);

        if (!rootFile.exists()) {
            System.out.println("Specified file/directory does not exist!");
            return;
        }

        recPrint(rootFile);

    }

    static void recPrint(File rootPath) {
        // TODO
        if (rootPath.isFile()) {
            printInfo(rootPath);
        }
        else if (rootPath.isDirectory()) {
            File[] files = rootPath.listFiles();
            if (files != null) {
                for (File file : files) {
                    recPrint(file);
                }
            }
        }

    }

    static void printInfo(File path) {
        // TODO
        System.out.println("Name: " + path.getName());
        System.out.println("Path: " + path.getAbsolutePath());
        System.out.println("Size: " + path.length() + " bytes");
        System.out.println("Last modified: " + new Date(path.lastModified()));
        System.out.println("Is directory: " + path.isDirectory());
        System.out.println("Is file: " + path.isFile());
    }
}
