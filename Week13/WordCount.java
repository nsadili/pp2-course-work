package Week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static int countWords(String filename) throws IOException {
        int cnt = 0;
        BufferedReader b = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = b.readLine()) != null) {
            String[] words = line.split(" ");
            for (String a : words) {
                if (a.length() > 3) {
                    cnt++;
                }
            }
        }
        b.close();
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        String filename = "example.txt";
        int wordCount = countWords(filename);
        System.out.println("Number of words: " + wordCount);
    }
}