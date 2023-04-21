package EX.EX3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {
        long start, end;
        File sourceFile = new File("/Users/macbook/pp2-course-work/Week12/EX/EX3/copy-dump.txt");
        File destFile = new File("/Users/macbook/pp2-course-work/Week12/EX/EX3/copy-dump.txt");
        start = System.currentTimeMillis();
        copyFile(sourceFile, destFile);
        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File source, File dest){
        try (var fis = new FileInputStream(source); var fos = new FileOutputStream(dest)) {
            int len;
            byte[] buffer = new byte[8];
            while((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
