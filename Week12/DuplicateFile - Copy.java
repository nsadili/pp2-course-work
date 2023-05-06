import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DuplicateFile {
    public static void main(String[] args) {
        String fileToBeCopied = "countries.csv";
        String copy = "copy.csv";
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