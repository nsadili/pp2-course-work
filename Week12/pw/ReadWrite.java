import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

    public static void main(String[] args) {
        String fileName = "example.txt"; // File name
        
        // Write some text to a file using FileWriter class
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is an example text file.\n");
            writer.write("It contains multiple lines.\n");
            writer.write("Each line is separated by a newline character.\n");
            writer.write("The end.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        // Read the content of the file using FileReader class
        try (FileReader reader = new FileReader(fileName)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            String fileContent = sb.toString();
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
