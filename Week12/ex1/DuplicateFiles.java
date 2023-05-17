package Week12.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\skybackground.jpg");
        File dest = new File("Resources\\forCopy\\copy-dump.txt");

        start = System.currentTimeMillis();

        // TODO

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File source, File dest) {

        try (var fis = new FileInputStream(source);
                var fos = new FileOutputStream(dest)) {

                    int len;
                    byte[] buff = new byte[8];

                    while ((len = fis.read(buff))>0) {
                        fos.write(buff);
                    }
                

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
