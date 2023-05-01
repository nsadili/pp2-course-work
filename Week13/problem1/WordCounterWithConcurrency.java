import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounterWithConcurrency {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "input.txt"; // replace with the name of your file
        int count = 0;
        int numThreads = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder chunkBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            chunkBuilder.append(line).append("\n");
            if (chunkBuilder.toString().split("\n").length == CHUNK_SIZE) {
                String chunk = chunkBuilder.toString();
                Thread t = new Thread(new WordCounterTask(chunk));
                t.start();
                numThreads++;
                chunkBuilder = new StringBuilder();
            }
        }
        reader.close();
        if (chunkBuilder.length() > 0) {
            String chunk = chunkBuilder.toString();
            Thread t = new Thread(new WordCounterTask(chunk));
            t.start();
            numThreads++;
        }
        WordCounterTask.waitForThreads(numThreads);
        count = WordCounterTask.getTotalCount();
        System.out.println("Total number of words: " + count);
    }

    private static class WordCounterTask implements Runnable {
        private final String chunk;
        private int count = 0;
        private static int totalCount = 0;
        private static int numFinishedThreads = 0;

        public WordCounterTask(String chunk) {
            this.chunk = chunk;
        }

        public void run() {
            String[] lines = chunk.split("\n");
            for (String line : lines) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 3) {
                        count++;
                    }
                }
            }
            synchronized (WordCounterTask.class) {
                totalCount += count;
                numFinishedThreads++;
                WordCounterTask.class.notifyAll();
            }
        }

        public static int getTotalCount() {
            return totalCount;
        }
        public static void waitForThreads(int numThreads) throws InterruptedException {
            synchronized (WordCounterTask.class) {
                while (numFinishedThreads < numThreads) {
                    WordCounterTask.class.wait();
                }
            }
        }
    }
}
