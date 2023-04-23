import java.io.File;

public class FileSystemTraverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path");
            return;

        }

        String filePath = args[0]; // first argument from command line
        // String filePath = "C:/Users/Lenovo/pp2-course-work/Week12/Week 12 - Incomplete/Resources/forCopy";
        File rootFile = new File(filePath);
        if (!rootFile.exists()) {
            System.out.println("Specified file/directory does not exist!");
            return;
        }

        recPrint(rootFile);

    }

    static void recPrint(File rootPath) {
        if (rootPath == null)
            return;
        if (rootPath.isFile()) {
            System.out.println("Name:" + rootPath.getName() + " Absolute path:" + rootPath.getAbsolutePath() + "\n");

            return;
        }
        System.out.printf("dir(%d) %s %s\n", rootPath.list().length, rootPath.getName(), rootPath.getAbsolutePath());
        for (File subFile : rootPath.listFiles()) {
            recPrint(subFile);
        }
    }

}
