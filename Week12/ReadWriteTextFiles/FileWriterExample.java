import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is an example text.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
