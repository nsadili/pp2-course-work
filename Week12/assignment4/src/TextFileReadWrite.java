import java.io.*;

public class TextFileReadWrite {

    public static void main(String[] args) {
        // Write some text to a file using FileWriter class
        String text = "This is a text for a programming exercise.";
        try {
            FileWriter writer = new FileWriter("testfile.txt");
            writer.write(text);
            writer.close();
            System.out.println("\nText has been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("\nAn error occurred while writing the text to the file.\n");
            e.printStackTrace();
        }

        // Read the content of the file using FileReader class
        try {
            FileReader reader = new FileReader("testfile.txt");
            // Using read() method
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("\nThe output using read() method: " + content);

            // Using read(char[]) method
            reader = new FileReader("testfile.txt");
            char[] buffer = new char[1024];
            content = new StringBuilder();
            int numCharsRead;
            while ((numCharsRead = reader.read(buffer)) != -1) {
                content.append(buffer, 0, numCharsRead);
            }
            System.out.println("\nThe output using read(char[]) method: " + content);
            System.out.println("");

            reader.close();
        } catch (IOException e) {
            System.out.println("\nAn error occurred while reading the file.\n");
            e.printStackTrace();
        }
    }
}
