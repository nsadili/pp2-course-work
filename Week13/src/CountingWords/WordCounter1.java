package CountingWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter1 {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Replace with your file name
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
            e.printStackTrace();
        }

        System.out.println("Total number of words: " + wordCount);
    }
}
