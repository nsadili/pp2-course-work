import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File {
    public File(String path) {
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("somefile.dat");

        int eof = 0;

        try {
            while ((eof = fis.read()) != -1) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getParent() {
        return null;
    }
}