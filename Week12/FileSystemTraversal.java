    package Week12;
    import java.io.File;

    public class FileSystemTraversal {
        public static void main(String[] args) {
            String path = "Week12/Files/input.txt";
            traverseFileSystem(path);
        }
    
        public static void printFileInfo(File file) {
            if (file.isFile()) {
                System.out.println("File Name: " + file.getName());
                System.out.println("File Path: " + file.getAbsolutePath());
                System.out.println("File Size: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                System.out.println("Directory Name: " + file.getName());
                System.out.println("Directory Path: " + file.getAbsolutePath());
            } else {
                System.out.println("Invalid file/directory path.");
            }
        }
    
        public static void traverseFileSystem(String path) {
            File file = new File(path);
    
            if (file.exists()) {
                if (file.isDirectory()) {
                    System.out.println("Directory Name: " + file.getName());
                    System.out.println("Directory Path: " + file.getAbsolutePath());
                    System.out.println("Subdirectories and Files:");
    
                    File[] files = file.listFiles();
                    if (files != null) {
                        for (File f : files) {
                            traverseFileSystem(f.getAbsolutePath());
                        }
                    }
                } else {
                    printFileInfo(file);
                }
            } else {
                System.out.println("File/directory does not exist.");
            }
        }
}