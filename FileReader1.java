package Week12;

    

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("myFile.txt");
            char[] buffer = new char[1024];
            int charactersRead;
            String content = "";
            while ((charactersRead = reader.read(buffer)) != -1) {
                content += new String(buffer, 0, charactersRead);
            }
            reader.close();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
