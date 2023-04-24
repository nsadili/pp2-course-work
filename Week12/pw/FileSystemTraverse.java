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
        if(rootPath.isDirectory()){
            File[] files = rootPath.listFiles();
            if (files != null) {
                for (File file : files) {
                    recPrint(file);
                }
            }
        } else if(rootPath.isFile()){
            printInfo(rootPath);
        }
    }

    static void printInfo(File path) {
        System.out.println(path.getName());
        System.out.println(path.getAbsolutePath());
        System.out.println(path.length());

    }
}