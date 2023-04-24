import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemPrinter {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }

}

// b. The purpose of enclosing the FileReader object in a BufferedReader is to provide buffering and
// efficient reading of the file contents. 
// The BufferedReader reads the file contents in chunks and stores them in a buffer, 
// which is more efficient than reading the file one character at a time with the FileReader.

// c. The advantage of wrapping one stream object in another is that it allows us 
// to add functionality to the underlying stream. In the case of PoemPrinter.java, 
// wrapping the FileReader object in a BufferedReader allows us to add buffering and 
// efficient reading to the file reading functionality. Additionally, wrapping streams in other streams 
// can provide features like compression, encryption, or filtering of the stream data.
