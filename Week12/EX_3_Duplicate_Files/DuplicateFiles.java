import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File originalFile = new File("dump.txt");
        File duplicateFile = new File("copy-dump.txt");

        start = System.currentTimeMillis();



        try (
                FileInputStream originalInputStream = new FileInputStream(originalFile);
                FileInputStream duplicateInputStream = new FileInputStream(duplicateFile);
        ) {
            int originalByte, duplicateByte;
            while ((originalByte = originalInputStream.read()) != -1) {
                duplicateByte = duplicateInputStream.read();
                if (originalByte != duplicateByte) {
                    System.out.println("The files are not the same.");
                    return;
                }
            }
            if (duplicateInputStream.read() != -1) {
                System.out.println("The files are not the same.");
                return;
            }
            System.out.println("The files are the same.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

}
