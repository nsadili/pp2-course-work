package CountingWords;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        int wordCount = 0;
        
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                if (token.length() > 3) {
                    wordCount++;
                }
            }
        }
        reader.close();
        
        System.out.println("Total number of words: " + wordCount);
    }
}
