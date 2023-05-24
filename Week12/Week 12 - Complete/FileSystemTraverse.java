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

    static void printInfo(File path) {
        if (path.isFile()) {
            recPrint(path);
        } else if (path.isDirectory()) {
            File[] files = path.listFiles();
            if (files != null) {
                for (File file : files) {
                    printInfo(file);
                }
            }
        }
    }
    
    static void recPrint(File rootPath) {
        System.out.println("File Name: " + rootPath.getName());
        System.out.println("Absolute Path: " + rootPath.getAbsolutePath());
        System.out.println("File Size: " + rootPath.length() + " bytes");
        System.out.println("Is Directory: " + rootPath.isDirectory());
        System.out.println("Is Hidden: " + rootPath.isHidden());
        System.out.println("Last Modified: " + rootPath.lastModified());
        System.out.println("-------------------------------");
    }
}

