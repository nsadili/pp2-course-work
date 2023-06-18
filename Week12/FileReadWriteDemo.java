package Ex4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        String filename = "demo.txt";
        String content = "Hello, World!";
        
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        try {
            FileReader reader = new FileReader(filename);
            int character;
            String fileContent = "";
            while ((character = reader.read()) != -1) {
                fileContent += (char) character;
            }
            reader.close();
            System.out.println("Content read using read(): " + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file using read().");
            e.printStackTrace();
        }
        
        try {
            FileReader reader = new FileReader(filename);
            char[] buffer = new char[1024];
            int length;
            String fileContent = "";
            while ((length = reader.read(buffer)) != -1) {
                fileContent += new String(buffer, 0, length);
            }
            reader.close();
            System.out.println("Content read using read(char[]): " + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file using read(char[]).");
            e.printStackTrace();
        }
    }
}
