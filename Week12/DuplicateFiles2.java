import java.io.*;

public class DuplicateFiles2 {
    public static void main(String[] args) {
        String fileToBeCopied = "output.txt";
        String copy = "copy.txt";
        try (InputStream is = new FileInputStream(fileToBeCopied);
             OutputStream os = new FileOutputStream(copy)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            System.out.println("File duplicated successfully!");
        }
        catch (IOException e) {
            System.err.println("Message: " + e);
        }
    }
}