import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("C:/Users/Lenovo/pp2-course-work/Week12/Week 12 - Incomplete/Resources/forCopy/Martin Iden - Jack London.txt");
        File dest = new File("C:/Users/Lenovo/pp2-course-work/Week12/Week 12 - Incomplete/Resources/forCopy/copy-Martin Iden - Jack London.txt");

        start = System.currentTimeMillis();

        copy(source, dest);

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copy(File sources, File destination) {
        if (!sources.exists())
            return;
        try (FileInputStream fis = new FileInputStream(sources);
                FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0)
                fos.write(buffer, 0, len);
        } catch (IOException a) {
            a.printStackTrace();
        }
    }

}
