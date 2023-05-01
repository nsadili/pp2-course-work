package CountingWords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCounter2 {
    private static final int CHUNK_SIZE = 300;

    public static void main(String[] args) {
        String filename = "input.txt";
        List<Thread> threads = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> chunk = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                chunk.add(line);
                if (chunk.size() == CHUNK_SIZE) {
                    Thread thread = new Thread(new WordCounterThread(chunk));
                    thread.start();
                    threads.add(thread);
                    chunk = new ArrayList<>();
                }
            }
            if (!chunk.isEmpty()) {
                Thread thread = new Thread(new WordCounterThread(chunk));
                thread.start();
                threads.add(thread);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        int totalWords = 0;
        for (Thread thread : threads) {
            try {
                thread.join();
                totalWords += ((WordCounterThread) thread).getWordCount();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Total words: " + totalWords);
    }

}