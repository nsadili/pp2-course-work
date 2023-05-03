import java.io.FileReader;
import java.io.IOException;

public class FileReaderCharArrayExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            char[] buffer = new char[1024];
            int bytesRead;
            StringBuilder content = new StringBuilder();

            while ((bytesRead = reader.read(buffer)) != -1) {
                content.append(buffer, 0, bytesRead);
            }
            reader.close();

            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
