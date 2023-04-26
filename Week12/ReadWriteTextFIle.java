import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteTextFIle {
    public static void main(String[] args) {
        // define the file path
        String filePath = "example.txt";
        // write some text to the file using FileWriter class
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello world");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // read the content of the file using FileReader class
        try {
            FileReader reader = new FileReader(filePath);
            StringBuilder content = new StringBuilder();
            int i;
            while ((i = reader.read()) != -1) {
                content.append((char) i);
            }
            reader.close();
            System.out.println("Content of the file: " + content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
