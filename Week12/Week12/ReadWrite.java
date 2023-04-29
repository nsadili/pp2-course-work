package Week12;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite{

    public static void main(String[] args) {
        String fileName = "example.txt";
        String fileContent = "Hello, World!\nThis is an example text file.";

        // Write some text to a file using FileWriter class
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println("Error writing to file " + fileName);
            e.printStackTrace();
            return;
        }

        // Read the content of the file using FileReader class with read() method
        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
            e.printStackTrace();
            return;
        }

        System.out.println(); // Print a new line

        // Read the content of the file using FileReader class with read(char[]) method
        try (FileReader fileReader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, length));
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
            e.printStackTrace();
            return;
        }
    }
}
