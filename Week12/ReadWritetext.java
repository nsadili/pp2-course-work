import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileExample {
    public static void main(String[] args) {
        String filename = "example.txt";
        String text = "Hello, world!";

    
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(text);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

     
        try {
            FileReader reader = new FileReader(filename);

           
            int character;
            String content = "";
            while ((character = reader.read()) != -1) {
                content += (char) character;
            }
            System.out.println(content);

       
            char[] buffer = new char[1024];
            int numCharsRead;
            content = "";
            while ((numCharsRead = reader.read(buffer)) != -1) {
                content += String.valueOf(buffer, 0, numCharsRead);
            }
            System.out.println(content);

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}





