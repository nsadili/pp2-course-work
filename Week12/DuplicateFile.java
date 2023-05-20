package Week12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFile {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Week11\\forCopy\\Martin Iden - Jack London.txt");
        File dest = new File("week12\\forCopy\\copy-Martin Iden - Jack London.txt");

        start = System.currentTimeMillis();
        copy(source, dest);
        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copy(File source, File dest){

        if(!source.exists()) return ;

        try (FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while((length = fis.read(buffer)) > 0){
                fos.write(buffer, 0, length);

            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
}