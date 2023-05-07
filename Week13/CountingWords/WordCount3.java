package Week13.CountingWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class WordCount3 {
    public static void main(String[] args) throws InterruptedException {
        String fileName = "example.txt";
        List<WordCountThread> threads = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineCount = 0;
            StringBuilder chunk = new StringBuilder();
            while ((line = br.readLine()) != null) {
                chunk.append(line).append("\n");
                lineCount++;
                if (lineCount == 300) {
                    threads.add(new WordCountThread(chunk.toString()));
                    chunk = new StringBuilder();
                    lineCount = 0;
                }
            }
            if (lineCount > 0) {
                threads.add(new WordCountThread(chunk.toString()));
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        int wordCount = 0;
        for (WordCountThread thread : threads) {
            thread.start();
        }
        for (WordCountThread thread : threads) {
            thread.join();
            wordCount += thread.getWordCount();
        }

        System.out.println("Word count: " + wordCount);
    }
}

class WordCountThread extends Thread {
    private final String chunk;
    private int wordCount;

    public WordCountThread(String chunk) {
        this.chunk = chunk;
    }

    public int getWordCount() {
        return wordCount;
    }

    @Override
    public void run() {
        String[] lines = chunk.split("\\n");
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > 3) {
                    wordCount++;
                }
            }
        }
    }
}
