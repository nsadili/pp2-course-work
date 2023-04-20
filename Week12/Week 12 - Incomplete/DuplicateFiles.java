import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.stream.FileImageOutputStream;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File sourceFile = new File("Resources\\forCopy\\Martin Iden - Jack London.txt");
        File destFile = new File("Resources\\forCopy\\copy-Martin Iden - Jack London.txt");

        start = System.currentTimeMillis();

        copyFile(sourceFile, destFile);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }
    static void copyFile(File source, File dest){
        try (var fis = new FileInputStream(source);var fos = new FileImageOutputStream(dest)) {
            int len;
            byte[] buffer = new byte[1024];
            while((len = fis.read(buffer))>0){
                fos.write(buffer, 0,len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
