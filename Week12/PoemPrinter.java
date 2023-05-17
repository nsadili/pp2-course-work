package Week12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemPrinter {
    public static void main(String[] args) {
        String filePath = "poem.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
