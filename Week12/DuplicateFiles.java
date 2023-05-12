package Week12;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;
        File sourceFile = new File("Week12/Resources/forCopy/Martin Iden - Jack London.txt");
        File destFile = new File("Week12/Resources/forCopy/Martin Iden - Jack Londoncpy.txt");

        start = System.currentTimeMillis();

        // TODO
        copyFile(sourceFile, destFile);
        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    static void copyFile(File source, File dest){
        try (var fis = new FileInputStream(source)) {
            var fos = new FileOutputStream(dest);
            int len;
            byte [] buff = new byte[8];
            while ((len = fis.read(buff)) > 0) {
                fos.write(buff, 0, len);
            }
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
