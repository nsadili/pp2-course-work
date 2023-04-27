package CountingWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Wordcounter {
    
    private static final int CHUNK_SIZE = 300;
    
    public static void main(String[] args) {
        
        String fileName = "file.txt"; // replace with the name of your file
        
        // Part (a) - single-threaded word count
        int wordCount = countWordsSingleThreaded(fileName);
        System.out.println("Single-threaded word count: " + wordCount);
        
        // Part (c) - multi-threaded word count
        int wordCountMultiThreaded = countWordsMultiThreaded(fileName);
        System.out.println("Multi-threaded word count: " + wordCountMultiThreaded);
    }
    
    private static int countWordsSingleThreaded(String fileName) {
        int wordCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return wordCount;
    }
    
    private static int countWordsMultiThreaded(String fileName) {
        int wordCount = 0;
        List<WordCountThread> threads = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            List<String> chunk = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                chunk.add(line);
                if (chunk.size() == CHUNK_SIZE) {
                    WordCountThread thread = new WordCountThread(chunk);
                    thread.start();
                    threads.add(thread);
                    chunk = new ArrayList<>();
                }
            }
            if (!chunk.isEmpty()) {
                WordCountThread thread = new WordCountThread(chunk);
                thread.start();
                threads.add(thread);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (WordCountThread thread : threads) {
            try {
                thread.join();
                wordCount += thread.getWordCount();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        return wordCount;
    }
    
    private static class WordCountThread extends Thread {
        
        private List<String> lines;
        private int wordCount;
        
        public WordCountThread(List<String> lines) {
            this.lines = lines;
            this.wordCount = 0;
        }
        
        @Override
        public void run() {
            for (String line : lines) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
        }
        
        public int getWordCount() {
            return wordCount;
        }
    }
}
