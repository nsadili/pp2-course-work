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
        // String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest";
        // String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest\\text.txt";
        // String filePath = "C:\\Users\\TUF DASH\\Documents\\PP2\\contest\\qovluq1";
        // String filePath = "C:\\Users\\TUF
        // DASH\\Documents\\PP2\\contest\\qovluq1\\file1inqovluq1.txt";
        // String filePath = "Resources";

        File rootFile = new File(filePath);

        // if (!rootFile.exists()) {
        //     System.out.println("Specified file/directory does not exist!");
        //     System.out.println("To create specified File enter 1:");
        //     Scanner sc = new Scanner(System.in);
        //     var x = sc.nextInt();
        //     if (x == 1) {
        //         try {
        //             rootFile.createNewFile();
        //             System.out.println("Path is created");
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     } else
        //         return;

        // }

        recPrint(rootFile);

    }

    static void recPrint(File rootPath) {
        if (rootPath.isFile()) {
            printInfo(rootPath);
            return;
        } else if (rootPath.isDirectory()) {

            System.out.println("Path is Directory -> " + rootPath.getName());

            String[] arr = rootPath.list();
            if (arr == null)
                return;
            System.out.println("Information for sub-files of <" + rootPath.getName() + ">");

            for (String path : arr) {
                // System.out.println("printin path: " + path);
                File newDir = new File(rootPath, path);

                // System.out.print("Printing: "+newDir +" " + arr.length);
                // System.out.println();
                // System.out.println("Absolute path:" + newDir.getAbsolutePath());

                recPrint(newDir);
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

        // path.delete();

        // var x= path.getParent();
        // File parent = new File(x);
        // System.out.println(path.list());
        // var arr = parent.listFiles();
        // Arrays.stream(arr).forEach((a) -> System.out.print(a.getName() + ", "));

    }
}
