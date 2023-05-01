import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\dump.txt");
        File dest = new File("Resources\\forCopy\\copy-dump.txt");

        start = System.currentTimeMillis();
        copy(source, dest);
  

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copy(File source, File dest) {
        if (!source.exists())
            return;
        try (FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(dest)) {

            int len;
            byte[] buffer = new byte[1024];

            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}