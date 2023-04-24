package week12;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String textToWrite = "Hello, World!";

      
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(textToWrite);
            writer.close();
            System.out.println("Successful");
        } catch (IOException e) {
            System.out.println(" error : " + e.getMessage());
        }

       
        try {
            FileReader reader = new FileReader(fileName);

            int character;
            StringBuilder textRead = new StringBuilder();
            while ((character = reader.read()) != -1) {
                textRead.append((char) character);
            }
            System.out.println(" read() method: " + textRead.toString());

            char[] buffer = new char[1024];
            textRead = new StringBuilder();
            while (reader.read(buffer) != -1) {
                textRead.append(buffer);
            }
            System.out.println(" read(char[]) method: " + textRead.toString());

            reader.close();
        } catch (IOException e) {
            System.out.println(" error : " + e.getMessage());
        }
    }

}
// differences: The main difference between these 
//two methods is that read() reads one character
//  at a time, while read(char[]) reads multiple 
//  characters at once. This can affect the performance 
//  of the read operation, especially for large files.
 