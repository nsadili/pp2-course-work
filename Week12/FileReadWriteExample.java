package Week12;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String content = "Hello, world!";

        // Write text to a file using FileWriter
        writeToFile(filePath, content);

        // Read the content of the file using FileReader
        String fileContent = readFromFile(filePath);
        System.out.println("Content read from file: " + fileContent);
    }

    private static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(filePath)) {
            

            // Using read() method
            /*while ((character = reader.read()) != -1) {
                contentBuilder.append((char) character);
            }*/

            // Using read(char[]) method
            char[] buffer = new char[1024];
            int bytesRead;
            while ((bytesRead = reader.read(buffer)) != -1) {
                contentBuilder.append(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
