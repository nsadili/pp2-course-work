package Week12;

import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\dump.txt");
        File dest = new File("Resources\\forCopy\\copy-dump.txt");

        start = System.currentTimeMillis();

        copyFile(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File source, File dest) {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}