import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingWords {
    public static void main(String[] args) {
        String filename = "example.txt";
        int wordCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of words in the file: " + wordCount);
    }
}
