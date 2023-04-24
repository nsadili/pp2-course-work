package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

    }

    public static void read(){
        try {
            FileReader reader = new FileReader("example.txt");
            int character = reader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (character != -1) {
                stringBuilder.append((char) character);
                character = reader.read();
            }
            reader.close();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // read using char[]
    public static void readUsingCharArray(){
        try {
            FileReader reader = new FileReader("example.txt");
            char[] buffer = new char[1024]; // Create a buffer to hold the data
            int numCharsRead;
            StringBuilder stringBuilder = new StringBuilder();
            while ((numCharsRead = reader.read(buffer)) != -1) {
                stringBuilder.append(buffer, 0, numCharsRead);
            }
            reader.close();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
