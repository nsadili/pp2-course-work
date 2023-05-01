import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WordCounter implements Callable<Integer> {
    private final List<String> lines;

    public WordCounter(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public Integer call() {
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
}

public class WordCounting {
    public static void main(String[] args) {
        String fileName = "file.txt"; // Replace with the path to your file

        // Without concurrency
        long startTime = System.currentTimeMillis();
        int wordCount = countWordsSequential(fileName);
        long endTime = System.currentTimeMillis();
        System.out.println("Word count (sequential): " + wordCount);
        System.out.println("Time taken (sequential): " + (endTime - startTime) + " ms");

        // With concurrency
        startTime = System.currentTimeMillis();
        wordCount = countWordsConcurrent(fileName);
        endTime = System.currentTimeMillis();
        System.out.println("Word count (concurrent): " + wordCount);
        System.out.println("Time taken (concurrent): " + (endTime - startTime) + " ms");
    }

    private static int countWordsSequential(String fileName) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static int countWordsConcurrent(String fileName) {
        int chunkSize = 300;
        List<String> lines = new ArrayList<>();
        List<WordCounter> tasks = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                lineNumber++;

                if (lineNumber % chunkSize == 0) {
                    tasks.add(new WordCounter(new ArrayList<>(lines)));
                    lines.clear();
                }
            }

            if (!lines.isEmpty()) {
                tasks.add(new WordCounter(lines));
            }

            List<Future<Integer>> results = executor.invokeAll(tasks);
            executor.shutdown();

            int totalCount = 0;
            for (Future<Integer> result : results) {
                totalCount += result.get();
            }

            return totalCount;
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
