import java.io.*;

public class FileWriteReadExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // The path of the file

        // Step 1: Write some text to a file using FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, world!\n");
            writer.write("This is an example file.\n");
            writer.write("We will now read its contents.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Step 2: Read the contents of the file using FileReader
        StringBuilder stringBuilder = new StringBuilder(); // Use StringBuilder to build the string from file contents
        try (FileReader reader = new FileReader(filePath)) {
            // Option 1: Read one character at a time
            // int content;
            // while ((content = reader.read()) != -1) {
            //     stringBuilder.append((char) content);
            // }

            // Option 2: Read an array of characters at a time
            char[] buffer = new char[1024]; // Use a buffer for efficient reading
            int length;
            while ((length = reader.read(buffer)) > 0) {
                stringBuilder.append(buffer, 0, length);
            }

            System.out.println("File contents: " + stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

// In this example, we first define the path of the file. 
// We then use a FileWriter to write some text to the file, and a FileReader to read the contents of the file. 
// We use a StringBuilder to build the string from the file contents, 
// and we can either use the read() method to read one character at a time or the read(char[]) method
// to read an array of characters at a time. 
// We then close the streams and catch any exceptions that might occur. 
// Finally, we print the contents of the file using the toString() method of the StringBuilder object. 
// The difference between the two options for reading the file is that 
// the first option reads one character at a time, which can be slower but consumes less memory, 
// while the second option reads a chunk of characters at a time, which is more efficient but uses more memory.
