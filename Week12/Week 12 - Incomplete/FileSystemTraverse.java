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

    static void recPrint(File root) {
        if (root == null)
            return;

        if (root.isFile()) {
            System.out.printf("file:  %s %s\n", root.getName(), root.getAbsolutePath());
            return;
        }

        System.out.printf("dir(%d) %s %s\n", root.list().length, root.getName(), root.getAbsolutePath());

        for (File subFile : root.listFiles()) {
            recPrint(subFile);
        }
    }

    static void printInfo(File path) {
        // TODO
    }
}