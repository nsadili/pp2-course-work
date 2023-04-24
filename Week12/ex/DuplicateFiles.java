import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\Martin Iden - Jack London.txt");
        File dest = new File("Resources\\forCopy\\copy-Martin Iden - Jack London.txt");

        start = System.currentTimeMillis();

      copyFile(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File src, File dst){
        try (var fis = new FileInputStream(src);
            var fos = new FileOutputStream(dst)){
                byte[] buff = new byte[1024];
                int len;

                while((len = fis.read(buff)) > 0)
                fos.write(buff, 0, len);

            }
        
         catch (IOException e) {
        
            e.printStackTrace();
        }
    }
}



