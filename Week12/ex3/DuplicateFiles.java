package ex3;

import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) throws IOException {
        // a. Given the path of an original file and another path to save the duplicate of it.
        String originalFilePath = "path/to/original/file";
        String duplicateFilePath = "path/to/duplicate/file";

        // b. What classes would you use? Does the type of file dictate the class selection here?
        FileInputStream originalFile = new FileInputStream(originalFilePath);
        FileOutputStream duplicateFile = new FileOutputStream(duplicateFilePath);

        // c. Duplicate the file (copy its contents)
        // d. You may consider reading i. A byte at a time and copy it. ii. An array of bytes at a time and copy it.
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = originalFile.read(buffer)) != -1) {
            duplicateFile.write(buffer, 0, bytesRead);
        }

        originalFile.close();
        duplicateFile.close();

        // e. Check if the new file is exactly the same as the original one.
        boolean filesMatch = compareFiles(originalFilePath, duplicateFilePath);
        if (filesMatch) {
            System.out.println("Files match");
        } else {
            System.out.println("Files do not match");
        }
    }

    static boolean compareFiles(String file1, String file2) throws IOException {
        FileInputStream file1Stream = new FileInputStream(file1);
        FileInputStream file2Stream = new FileInputStream(file2);

        int file1Byte, file2Byte;
        do {
            file1Byte = file1Stream.read();
            file2Byte = file2Stream.read();
            if (file1Byte != file2Byte) {
                file1Stream.close();
                file2Stream.close();
                return false;
            }
        } while (file1Byte != -1 && file2Byte != -1);

        file1Stream.close();
        file2Stream.close();
        return true;
    }
}

