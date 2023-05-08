import java.io.*;

public class FileSystemTraverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path!");
            return;
        }

        String path = args[0];

        File rootFile = new File(path);

        if (!rootFile.exists()) {
            System.out.println("Specified file/directory does not exist!");
            return;
        }

        rPrint(rootFile);

    }

    static void rPrint(File root) {
        if (root == null)
            return;
        if (root.isFile()) {
            System.out.printf("file: %s %s\n", root.getName(), root.getAbsolutePath());
            return;
        }
        System.out.printf("dir(%d %s %s \n", root.list().length, root.getName(), root.getAbsoluteFile());

        for (File subFile : root.listFiles()) {
            rPrint(subFile);
        }

    }

}