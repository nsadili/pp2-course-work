package PW.PW7;
import java.io.File;

public class FileSystemTraverse {
    public static void main(String[] args) {
        ifEntered(args);
        String filePath = args[0];
        File rootFile = new File(filePath);
        ifExists(rootFile);
        recursPrint(rootFile);
    }

    static void recursPrint(File rootFile) {
        if (rootFile.isFile()) {
            printInfo(rootFile, 1);
        } else {
            System.out.println("\"" + rootFile.getName() + "\" -> files & directories: ");
            File[] files = rootFile.listFiles();
            listFiles(files);
        }
    }

    static void listFiles (File [] files) {
        Integer cnt = 0;
        for (File file: files) {
            cnt++;
            printInfo(file, cnt);
        }
    }

    static void printInfo(File path, Integer cnt) {
        System.out.printf("Item %d: %s\n", cnt, path);
    }

    static void ifExists (File file) {
        if (!file.exists()) {
            System.out.println("Specified file/directory does not exist!");
            System.exit(0);
        }
    }

    static void ifEntered (String [] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path!");
            System.exit(0);
        }
    }
}
