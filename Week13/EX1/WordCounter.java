import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String fileName = "input.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    if (word.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Word count: " + wordCount);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
