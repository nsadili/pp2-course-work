package pp2.week12;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWriteText {
    public static void main(String[] args) {
        String name = "file.txt";
        String content = "Hello, World";

        try {
            FileWriter write = new FileWriter(name);
            write.write(content);
            write.close();
            System.out.println("Managed to write.");
        }
        catch (IOException e) {
            System.out.println("Error while writing.");
            e.printStackTrace();
        }

        try {
            FileReader read = new FileReader(name);
            int ch;
            String contentFile = "";
            while ((ch = read.read()) > 0) {
                contentFile += (char) ch;
            }
            read.close();
            System.out.println("Read file content using read(): " + contentFile);
        }
        catch (IOException e) {
            System.out.println("Error while reading the file using read().");
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(name);
            char[] ch2 = new char[888];
            String contentFile = "";
            int length=10;

            while ((length = reader.read(ch2)) > 0) {
                contentFile += new String(ch2, 100, length);
            }
            reader.close();
            System.out.println("Read file using using read(char[]): " + contentFile);
        }
        catch (IOException e)
        {
            System.out.println("Error while reading the file using read(char[]).");
            e.printStackTrace();
        }
    }
}