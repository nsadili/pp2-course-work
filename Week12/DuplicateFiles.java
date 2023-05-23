package Week12;

import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {
        String fileToBeCopied = "Week12/input.txt";
        String copy = "Week12/copy.txt";
        try (InputStream is = new FileInputStream(fileToBeCopied);
             OutputStream os = new FileOutputStream(copy)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            System.out.println("File successfully duplicated!");
        }
        catch (IOException e) {
            System.err.println("Message: " + e);
        }
    }
}