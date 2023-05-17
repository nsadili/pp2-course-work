package Week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) {
        String filename = "input.txt";

        // Single-threaded approach
        long startTime = System.currentTimeMillis();
        int wordCountSingleThread = countWordsSingleThread(filename);
        long endTime = System.currentTimeMillis();
        long singleThreadTime = endTime - startTime;

        System.out.println("Single-threaded Word Count: " + wordCountSingleThread);
        System.out.println("Single-threaded Time Taken: " + singleThreadTime + "ms");
        System.out.println();

        // Multi-threaded approach
        startTime = System.currentTimeMillis();
        int wordCountMultiThread = countWordsMultiThread(filename);
        endTime = System.currentTimeMillis();
        long multiThreadTime = endTime - startTime;

        System.out.println("Multi-threaded Word Count: " + wordCountMultiThread);
        System.out.println("Multi-threaded Time Taken: " + multiThreadTime + "ms");
    }

    public static int countWordsSingleThread(String filename) {
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
        return wordCount;
    }

    public static int countWordsMultiThread(String filename) {
        List<CountingThread> threads = new ArrayList<>();
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;
            CountingThread thread = null;

            while ((line = reader.readLine()) != null) {
                if (lineNumber % CHUNK_SIZE == 0) {
                    thread = new CountingThread();
                    threads.add(thread);
                }
                thread.addLine(line);
                lineNumber++;
            }

            // Start and join all threads
            for (CountingThread t : threads) {
                t.start();
            }
            for (CountingThread t : threads) {
                try {
                    t.join();
                    wordCount += t.getWordCount();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    static class CountingThread extends Thread {
        private int wordCount;
        private List<String> lines;

        public CountingThread() {
            this.wordCount = 0;
            this.lines = new ArrayList<>();
        }

        public void addLine(String line) {
            lines.add(line);
        }

        public int getWordCount() {
            return wordCount;
        }

        @Override
        public void run() {
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
}
