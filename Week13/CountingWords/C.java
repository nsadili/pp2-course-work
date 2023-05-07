package Week13.CountingWords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) {
        String fileName = "Week13/Resouces/A.txt";
        int numThreads = 4;
        int[] wordCounts = new int[numThreads];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // for reading a file 
            String line;
            int threadIndex = 0;
            StringBuilder chunk = new StringBuilder();
            while ((line = br.readLine()) != null) {
                chunk.append(line).append("\n");
                if (chunk.toString().split("\n").length == 300) {
                    String currentChunk = chunk.toString();
                    chunk = new StringBuilder();
                    int finalThreadIndex = threadIndex;
                    new Thread(() -> {
                        String[] tokens = currentChunk.split("\\s+"); // to split lines into tokens we use split() method 
                        for (String token : tokens) { 
                            if (token.length() > 3) {
                                wordCounts[finalThreadIndex]++;
                            }
                        }
                    }).start();
                    threadIndex++;
                }
            }
            if (chunk.length() > 0) {
                String currentChunk = chunk.toString();
                int finalThreadIndex = threadIndex;
                new Thread(() -> {
                    String[] tokens = currentChunk.split("\\s+");
                    for (String token : tokens) {
                        if (token.length() > 3) {
                            wordCounts[finalThreadIndex]++;
                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int totalWordCount = 0;
        for (int count : wordCounts) {
            totalWordCount += count;
        }
        System.out.println("The number of the words in one file " + totalWordCount);

        
        // D part starts here
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}



// Java program to count the number of words in a file using multiple threads, where each thread counts the words in a chunk of 300 lines