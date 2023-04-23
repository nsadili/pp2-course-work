import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

       // File source = new File("Resources\\forCopy\\dump.txt");
       // File dest = new File("Resources\\forCopy\\copy-dump.txt");
       File source = new File("Resources\\forCopy\\ADA Campus.jfif");
        File dest = new File("Resources\\forCopy\\copy-ADA Campus.jfif");

        start = System.currentTimeMillis();

        copyFile(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File source, File dest){

        try (var fis = new FileInputStream(source); 
             var fos = new FileOutputStream(dest)){

                int len;
            byte[] buff = new byte[8];
            while((len = fis.read(buff)) > 0){
                fos.write(buff, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
