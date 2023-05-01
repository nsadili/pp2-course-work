import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

    public static void main(String[] args) {
        String fileName = "example_of_file.txt"; 
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is an example text file.\n");
            writer.write("It contains multiple lines.\n");
            writer.write("It has 4 words in it.\n");
            writer.write("Each line is separated by a newline character.\n");
            writer.write("Finish");
        } catch (IOException e) {
            System.err.println("Error writing to file: example_of_file.txt " + e.getMessage());
        }
        
        try (FileReader reader = new FileReader(fileName)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            String fileContent = sb.toString();
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("Error reading file - example_of_file.txt : " + e.getMessage());
        }
    }
}
