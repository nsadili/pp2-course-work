import java.io.File;

public class ex7 {
    public static void main(String[] args) {
        // getInfo("./Exercise12/src/ex4/testfile.txt");
        // getInfo("./Exercise12/src/ex4");
        // getInfo("./Exercise12/src/ex420");
        getAllFileInfo("./Exercise12/src");
    }

    public static void getInfo(String path) {
        File file = new File(path);

        if (!file.exists())
            System.out.println("File does not exist.");
        else {
            if (file.isFile())
                System.out.println("Type: File");
            else if (file.isDirectory())
                System.out.println("Type: Directory");

            System.out.println("Name: " +  file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + "\n");
        }
    }
    
    public static void getAllFileInfo(String path) {
        File file = new File(path);
        System.out.println("Listing files the path " + path);

        if (file.isFile())
            getInfo(path);
        else {
            File[] flist = file.listFiles();

            for (File x: flist) {
                getAllFileInfo(x.toString());
            }
        }
    }
}