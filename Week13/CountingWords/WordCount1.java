package Week13.CountingWords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount1 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Word count: " + wordCount);
    }
}
