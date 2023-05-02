package Week12;
import java.io.File;

public class FileSystemTraversal {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a path!");
            return;
        }

        String filePath = args[0]; 

        File rootFile = new File(filePath);

        if (!rootFile.exists()) {
            System.out.println("Specified file/directory does not exist!");
            return;
        }

        recPrint(rootFile);

    }

    static void recPrint(File root) {
        if(root==null){
            return;
        }
        if(root.isFile()){
            System.out.printf("file: %s %s\n", root.getName(), root.getAbsolutePath());
            return;
        }
        System.out.printf("dir(%d) %s %s\n", root.list().length, root.getName(), root.getAbsoluteFile());
        for(File subFile: root.listFiles()){
            recPrint(subFile);
        }
    }
}