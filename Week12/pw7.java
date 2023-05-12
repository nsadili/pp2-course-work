package Week12;
import java.io.File;

public class pw7 {
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
        if (rootPath.isFile()) {
            printInfo(rootPath);
        } else {
            System.out.println("\"" + rootPath.getName() + "\" -> files & directories: ");
            File[] files = rootPath.listFiles();
            printInfo(files);
        }
    }

    static void printInfo(File path) {
        System.out.printf("Item: %s\n", path);
    }

    static void printInfo(File path[]) {
        for (File file : path) {
            System.out.printf("Item: %s\n", file.toString());
        }
    }
}
