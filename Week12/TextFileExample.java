package Week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileExample {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example text to be written to a file.";

        // Write to file using FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file using FileReader and read() method
        try (FileReader reader = new FileReader(fileName)) {
            int data;
            String result = "";
            while ((data = reader.read()) != -1) {
                result += (char) data;
            }
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Read from file using FileReader and read(char[]) method
        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charsRead;
            String result = "";
            while ((charsRead = reader.read(buffer)) != -1) {
                result += new String(buffer, 0, charsRead);
            }
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
