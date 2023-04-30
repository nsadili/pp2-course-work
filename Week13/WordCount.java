import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class WordCount {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) {
        String filename = "input.txt";

        long startTime = System.currentTimeMillis();
        int wordCountNoConcurrency = wordCountNoConcurrency(filename);
        long endTime = System.currentTimeMillis();
        long durationNoConcurrency = endTime - startTime;
        System.out.println("WordCountNoConcurrency took " + durationNoConcurrency + " milliseconds");
        System.out.println("Word count (no concurrency): " + wordCountNoConcurrency);

    
        startTime = System.currentTimeMillis();
        int wordCountWithConcurrency = wordCountWithConcurrency(filename);
        endTime = System.currentTimeMillis();
        long durationWithConcurrency = endTime - startTime;
        System.out.println("WordCountWithConcurrency took " + durationWithConcurrency + " milliseconds");
        System.out.println("Word count (with concurrency): " + wordCountWithConcurrency);
    }

    private static int wordCountNoConcurrency(String filename) {
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
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

    private static int wordCountWithConcurrency(String filename) {
        AtomicInteger wordCount = new AtomicInteger(0);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int chunkCount = 0;
            String[] chunk = new String[CHUNK_SIZE];

            while ((line = br.readLine()) != null) {
                chunk[chunkCount] = line;
                chunkCount++;

                if (chunkCount == CHUNK_SIZE) {
                    Thread t = new Thread(new WordCounter(chunk, wordCount));
                    t.start();
                    t.join();
                    chunkCount = 0;
                    chunk = new String[CHUNK_SIZE];
                }
            }

      
            if (chunkCount > 0) {
                Thread t = new Thread(new WordCounter(chunk, wordCount));
                t.start();
                t.join();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return wordCount.get();
    }

    private static class WordCounter implements Runnable {
        private final String[] chunk;
        private final AtomicInteger wordCount;

        public WordCounter(String[] chunk, AtomicInteger wordCount) {
            this.chunk = chunk;
            this.wordCount = wordCount;
        }

        @Override
        public void run() {
            int localWordCount = 0;

            for (String line : chunk) {
                if (line == null) {
                    continue;
                }

                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        localWordCount++;
                    }
                }
            }

            wordCount.addAndGet(localWordCount);
        }
    }
}
