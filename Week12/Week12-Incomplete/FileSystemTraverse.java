import java.io.File;

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
        if (rootPath == null) {
            System.out.println("The file is null.");
            return;
        }
        if (rootPath.isFile()) {
            printInfo(rootPath);
            return;
        }
        System.out.printf("Dir(%d): %s %s\n", rootPath.list().length, rootPath.getName(), rootPath.getAbsolutePath());
        for (File f : rootPath.listFiles()) {
            recPrint(f);
        }
        // System.out.println();
    }

    static void printInfo(File path) {
        System.out.printf("File: %s %s\n", path.getName(), path.getAbsolutePath());
    }
}