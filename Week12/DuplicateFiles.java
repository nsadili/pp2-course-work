import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {
        String originalFilePath = "original.txt";
        String duplicateFilePath = "duplicate.txt";

        duplicateFile(originalFilePath, duplicateFilePath);

        boolean isSame = compareFiles(originalFilePath, duplicateFilePath);
        System.out.println("Are the files the same? " + isSame);
    }

    public static void duplicateFile(String originalFilePath, String duplicateFilePath) {
        try (InputStream is = new FileInputStream(originalFilePath);
             OutputStream os = new FileOutputStream(duplicateFilePath)) {

            // Read and write a byte at a time
            int byteRead;
            while ((byteRead = is.read()) != -1) {
                os.write(byteRead);
            }
            System.out.println("File duplicated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean compareFiles(String filePath1, String filePath2) {
        try (InputStream is1 = new FileInputStream(filePath1);
             InputStream is2 = new FileInputStream(filePath2)) {

            int byteRead1, byteRead2;
            do {
                byteRead1 = is1.read();
                byteRead2 = is2.read();

                if (byteRead1 != byteRead2) {
                    return false;
                }
            } while (byteRead1 != -1 && byteRead2 != -1);

            // Check if both files have reached the end
            return (byteRead1 == -1 && byteRead2 == -1);

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
