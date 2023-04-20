package Incomplete;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {
        long start, end;
        File sourceFile = new File("Incomplete/Resources/forCopy/dump.txt");
        File destFile = new File("Incomplete/Resources/forCopy/copy-dump.txt");
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
