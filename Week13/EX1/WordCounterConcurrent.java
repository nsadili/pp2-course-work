import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class ChunkProcessor implements Callable<Integer> {
    private List<String> lines;

    ChunkProcessor(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public Integer call() {
        int wordCount = 0;
        for (String line : lines) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                if (tokenizer.nextToken().length() > 3) {
                    wordCount++;
                }
            }
        }
        return wordCount;
    }
}

public class WordCounterConcurrent {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        String fileName = "input.txt"; // Replace with your file path
        ExecutorService executor = Executors.newFixedThreadPool(4); // Adjust according to your system's capabilities
        List<Future<Integer>> results = new ArrayList<>();
        List<String> chunk = new ArrayList<>();
        int chunkSize = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                chunk.add(line);
                chunkSize++;

                if (chunkSize == 300) {
                    Future<Integer> future = executor.submit(new ChunkProcessor(chunk));
                    results.add(future);
                    chunk = new ArrayList<>();
                    chunkSize = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (chunkSize > 0) {
            Future<Integer> future = executor.submit(new ChunkProcessor(chunk));
            results.add(future);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        int totalWordCount = 0;
        for (Future<Integer> result : results) {
            totalWordCount += result.get();
        }

        System.out.println("Word count: " + totalWordCount);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
