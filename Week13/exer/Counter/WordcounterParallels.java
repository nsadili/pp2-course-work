package exer.Counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordcounterParallels {

    public static void main(String[] args) {
        String rndmfile = "rndmfile.txt";
        int numThreads = 4;
        long startTime = System.nanoTime();
        int wordCount = countWordsParallel(rndmfile, numThreads);
        long endTime = System.nanoTime();
        System.out.println("Word count: " + wordCount);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
    }

    public static int countWordsParallel(String rndmfile, int numThreads) {
        List<Counter> counters = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            counters.add(new Counter());
        }
        List<Thread> threads = new ArrayList<>();
        try {
            File file = new File(rndmfile);
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);

            String ln;
            int lineNumber = 0;
            Counter counter;
            while ((ln = bufferedreader.readLine()) != null) {
                if (lineNumber % numThreads == 0) {
                    counter = counters.get(0);
                } else {
                    counter = counters.get(lineNumber % numThreads);
                }
                String[] words = ln.split(" ");
                for (String word : words) {
                    if (word.length() > 3) {
                        counter.increment();
                    }
                }
                lineNumber++;
            }

            bufferedreader.close();
            filereader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Start and join all threads
        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(new WordCounterRunnable(counters.get(i)));
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int wordCount = 0;
        for (Counter counter : counters) {
            wordCount += counter.getValue();
        }
        return wordCount;
    }
}
