import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\ADA Campus.jfif");
        File dest = new File("Resources\\forCopy\\copy-ADA Campus.jfif");

        start = System.currentTimeMillis();

        copy(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copy(File source, File dest){
        if(!source.exists())
            return;
        try (FileInputStream fis = new FileInputStream(source)){
            FileOutputStream fos = new FileOutputStream(dest);
            int len;
            byte[] buffer = new byte[16384]; // it takes 1 ms

            while ((len=fis.read(buffer))>0){
                fos.write(buffer, 0, len);
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

