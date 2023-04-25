import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileSystemTraverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a path!");
            return;
        }

         String filePath = args[0]; // first argument from command line
        //   String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest";
        // String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest\\text.txt";
        //   String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest\\qovluq1";
        // String filePath = "C:\\Users\\TUF
        // DASH\\Documents\\PP2\\contest\\qovluq1\\file1inqovluq1.txt";
        //  String filePath = "Resources";

        File rootFile = new File(filePath);


        recPrint(rootFile);

    }

    static void recPrint(File rootPath) {
        if (rootPath.isFile()) {
            printInfo(rootPath);
            return;
        } else if (rootPath.isDirectory()) {

            System.out.println("Path is Directory -> " + rootPath.getName());

            String[] arr = rootPath.list();
           File[] arr2 =  rootPath.listFiles();
            if (arr == null)
                return;
            System.out.println("Information for sub-files of <" + rootPath.getName() + ">");

            for (File path : arr2) {
                recPrint(path);
            }
            System.out.println("END of Directory <" + rootPath.getName() + ">");

        }

    }

    static void printInfo(File path) {

        if (path.isFile())
            System.out.println("Path is file -> " + path.getName());
        // System.out.println("Name:" + path.getName());
        System.out.println("Absolute Path:" + path.getAbsolutePath());
        System.out.println("Parent folder:" + path.getParent());
        System.out.println("Length:" + path.length());

        

    }
}