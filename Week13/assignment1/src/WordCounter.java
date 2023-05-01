import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WordCounter {

    private static final int LINES_PER_CHUNK = 300;
    private static final int THREAD_POOL_SIZE = 4;

    public static void main(String[] args) {
        String fileName = "C:/Users/99450/Desktop/All Files/PP2 (Vasif)/pp2-course-work/Week13/assignment1/src/file.txt";

        long startTime = System.currentTimeMillis();
        int wordCount = countWords(fileName);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Word count without concurrency: " + wordCount + " in " + elapsedTime + "ms");

        startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        List<WordCounterThread> wordCounterThreads = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                if (lineNumber % LINES_PER_CHUNK == 0) {
                    WordCounterThread wordCounterThread = new WordCounterThread();
                    wordCounterThread.setStartLineNumber(lineNumber);
                    wordCounterThread.setFileName(fileName);
                    wordCounterThreads.add(wordCounterThread);
                    executorService.execute(wordCounterThread);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalWords = 0;
        for (WordCounterThread wordCounterThread : wordCounterThreads) {
            totalWords += wordCounterThread.getWordCount();
        }

        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Word count with concurrency: " + totalWords + " in " + elapsedTime + "ms");
    }

    private static int countWords(String fileName) {
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

    private static class WordCounterThread implements Runnable {
        private int startLineNumber;
        private String fileName;
        private int wordCount;

        public void setStartLineNumber(int startLineNumber) {
            this.startLineNumber = startLineNumber;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public int getWordCount() {
            return wordCount;
        }

        @Override
        public void run() {
            int lineNumber = startLineNumber;
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                for (int i = 0; i < lineNumber; i++) {
                    br.readLine();
                }
                while ((line = br.readLine()) != null && lineNumber < startLineNumber + LINES_PER_CHUNK) {
                    String[] tokens = line.split("\\s+");
                    for (String token : tokens) {
                        if (token.length() > 3) {
                            wordCount++;
                        }
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}