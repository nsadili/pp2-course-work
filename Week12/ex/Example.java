import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileInputStream fis = new FileInputStream("text.txt");

        int d = fis.read();

        //byte[] b = new bytes[8];

        FileOutputStream fos = new FileOutputStream("file.txt", true);
    }
}
