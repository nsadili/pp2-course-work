package Week12.ex;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DublicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("/Users/taghi/Documents/pp2-taghi-mammadov/pp2-course-work/Week12/Resources/forCopy/copy-Marcus Rashford - Manchester United.txt");
        File dest = new File("/Users/taghi/Documents/pp2-taghi-mammadov/pp2-course-work/Week12/Resources/forCopy/copy-Marcus Rashford - Manchester United.txt");

        start = System.currentTimeMillis();
        CopyFile(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }
    static void CopyFile(File src, File dst){
        try (var fis = new FileInputStream(src);
               var fos= new FileOutputStream(dst)) {

            byte[] buff= new byte[1024];
            int len;
            while((len= fis.read(buff))>0)
               fos.write(buff,0,len);

        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }
}
