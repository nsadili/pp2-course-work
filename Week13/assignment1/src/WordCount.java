import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        long startTime = System.currentTimeMillis();
        int wordCount = countWords(lines);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("\nWords without concurrency: " + wordCount);
        System.out.println("\nTime without concurrency: " + timeTaken + "ms");

        startTime = System.currentTimeMillis();
        wordCount = countWordsWithConcurrency(lines);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("\nWords with concurrency: " + wordCount);
        System.out.println("\nTime with concurrency: " + timeTaken + "ms\n");
    }

    private static int countWords(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                if (token.length() > 3) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countWordsWithConcurrency(List<String> lines) throws InterruptedException {
        int count = 0;
        List<CountWordsThread> threads = new ArrayList<>();
        for (int i = 0; i < lines.size(); i += CHUNK_SIZE) {
            int end = Math.min(i + CHUNK_SIZE, lines.size());
            CountWordsThread thread = new CountWordsThread(lines.subList(i, end));
            threads.add(thread);
            thread.start();
        }
        for (CountWordsThread thread : threads) {
            thread.join();
            count += thread.getWordCount();
        }
        return count;
    }

    private static class CountWordsThread extends Thread {
        private final List<String> lines;
        private int wordCount;

        public CountWordsThread(List<String> lines) {
            this.lines = lines;
        }

        public int getWordCount() {
            return wordCount;
        }

        @Override
        public void run() {
            wordCount = countWords(lines);
        }
    }
}