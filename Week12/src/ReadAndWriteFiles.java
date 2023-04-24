import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFiles {
    public static void main(String[] args) {
        // a. Using FileWriter class, write some text to a file.
        String text = "Hello, world!";
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write(text);
            writer.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // b. Using FileReader class, read the content of the file.
        // i. Try using read() method
        try {
            FileReader reader = new FileReader("myfile.txt");
            int character;
            String content = "";
            while ((character = reader.read()) != -1) {
                content += (char) character;
            }
            reader.close();
            System.out.println("Content of the file using read() method:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // ii. Try using read(char[]) method
        try {
            FileReader reader = new FileReader("myfile.txt");
            char[] buffer = new char[1024];
            int length = reader.read(buffer);
            reader.close();
            String content = new String(buffer, 0, length);
            System.out.println("Content of the file using read(char[]) method:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // iii. What are their differences?
        // The read() method reads a single character at a time and returns it as an
        // integer.
        // The read(char[]) method reads multiple characters into a buffer and returns
        // the number of characters read.
    }
}
