import java.io.File;

public class FileInfoPrinter {
    
    public static void printFileInfo(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File/directory does not exist!");
            return;
        }
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        if (file.isDirectory()) {
            System.out.println("Type: Directory");
            System.out.println("Contains: " + file.list().length + " files/directories");
        } else {
            System.out.println("Type: File");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        }
        System.out.println();
    }
    
    public static void printDirectoryInfo(String path) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Not a valid directory path!");
            return;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                printDirectoryInfo(file.getAbsolutePath());
            } else {
                printFileInfo(file.getAbsolutePath());
            }
        }
    }
    
    public static void main(String[] args) {
        // Example usage:
        printFileInfo("C:\\Windows\\System32\\calc.exe");
        printFileInfo("C:\\Windows");
        printDirectoryInfo("C:\\Windows");
    }
}

// The printFileInfo method takes a path as a parameter, creates a File object, 
// and then prints some information about it. The if block at the beginning checks if the file/directory exists. 
// Then, it prints the name, absolute path, and size of the file/directory. 
// If it's a directory, it also prints the number of files/directories it contains. 
// If it's a file, it also prints whether it's readable, writable, and executable.

// The printDirectoryInfo method takes a path as a parameter, creates a File object, 
// and then checks if it's a valid directory path. 
// If it is, it lists all the files/directories in the directory and calls printFileInfo for each file and 
// printDirectoryInfo recursively for each directory. This prints the information for all the files/directories
// in the directory and its subdirectories.
