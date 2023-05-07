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

        CopyFile(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void CopyFile(File src, File dst){

       try (var fis = new FileInputStream(src);
               var fos = new FileOutputStream(dst)) {

            byte[] buf = new byte[8];
            int len;

            while ((len = fis.read(buf)) > 0)
                  fos.write(buf, 0, len);
                
    } catch (IOException e) {
        e.printStackTrace();
    }

    }

}