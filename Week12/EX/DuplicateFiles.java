package EX;

import java.io.*;

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
            int length;
            byte[] buffer = new byte[8];
            while((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
