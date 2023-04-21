package Week12;

public import java.io.*;

public class TextFileExample {

    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, world!";

        // Writing to file using FileWriter
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file using FileReader and read() method
        try (FileReader reader = new FileReader(filename)) {
            int character;
            StringBuilder builder = new StringBuilder();
            while ((character = reader.read()) != -1) {
                builder.append((char) character);
            }
            String fileContent = builder.toString();
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Reading from file using FileReader and read(char[]) method
        try (FileReader reader = new FileReader(filename)) {
            char[] buffer = new char[1024];
            StringBuilder builder = new StringBuilder();
            int charsRead;
            while ((charsRead = reader.read(buffer)) != -1) {
                builder.append(buffer, 0, charsRead);
            }
            String fileContent = builder.toString();
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
 {
    
}
