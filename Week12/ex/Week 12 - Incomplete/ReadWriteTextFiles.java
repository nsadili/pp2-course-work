import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFiles {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        long start, end;

        // File source = new File("Week12\\Reader.txt");
        File source = new File("source.txt");
        // File dest = new File("Week12\\Writer.txt");
        File dest = new File("dest.txt");

        start = System.currentTimeMillis();

        write(source, dest);
        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));

    }

    static void write(File source, File dest) throws FileNotFoundException, IOException {

        String info = "This a reader and writer file practice";
        // char[] chars = (char[]) info;
        // char[] chars = new CharArrayReader(null)
        int len;

        if (!source.exists())
            return;

        try (FileReader fr = new FileReader(source);
                FileWriter fw = new FileWriter(dest)) {

            // while(len = fr.read(info) > 0) {
            // fw.write(info);

            // }

            fr.read();
            fw.write(info);

        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
