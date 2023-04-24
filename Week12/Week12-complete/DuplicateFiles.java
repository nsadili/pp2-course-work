import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DuplicateFiles {
    public static void main(String[] args) throws IOException {

        long start, end;

        File source = new File("Resources\\forCopy\\dump.txt");
        File dest = new File("Resources\\forCopy\\copy-dump.txt");

        start = System.currentTimeMillis();

        dublicate(source, dest);
        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    public static void dublicate(File source, File destination) throws IOException {
        try (InputStream is = new FileInputStream(source);
                OutputStream os = new FileOutputStream(destination)) {
            byte[] d = new byte[8 * 1000];
            int s;
            while ((s = is.read()) > 0) {
                os.write(d, 0, s);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
