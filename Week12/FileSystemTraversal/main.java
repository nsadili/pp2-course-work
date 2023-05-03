import java.io.File;

public class main {

    public static void printFileInfo(String path) {
        File file = new File(path);

    if (file.exists()) {
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Type: " + (file.isFile() ? "File" : "Directory"));
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    } else {
        System.out.println("The specified path does not exist.");
    }
    }

        public static void traverseFileSystem(String path) {
            File file = new File(path);
        
            if (file.exists()) {
                if (file.isFile()) {
                    printFileInfo(path);
                } else if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    if (files != null) {
                        for (File subFile : files) {
                            traverseFileSystem(subFile.getAbsolutePath());
                        }
                    }
                }
            } else {
                System.out.println("The specified path does not exist.");
            }
        }
        
    }
