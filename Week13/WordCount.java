package Week13

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "file.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
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

        System.out.println("Total words: " + wordCount);
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountThread extends Thread {
    private String fileName;
    private int startLine;
    private int endLine;
    private int wordCount;

    public WordCountThread(String fileName, int startLine, int endLine) {
        this.fileName = fileName;
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public int getWordCount() {
        return wordCount;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null && lineNumber <= endLine) {
                if (lineNumber >= startLine) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (word.length() > 3) {
                            wordCount++;
                        }
                    }
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String fileName = "file.txt";
        int numThreads = 4;
        int chunkSize = 300;

        WordCountThread[] threads = new WordCountThread[numThreads];
        int startLine = 1;
        int endLine = chunkSize;

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new WordCountThread(fileName, startLine, endLine);
            threads[i].start();
            startLine = endLine + 1;
            endLine = startLine + chunkSize - 1;
        }

        int totalWordCount = 0;
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
            totalWordCount += threads[i].getWordCount();
        }

        System.out.println("Total words: " + totalWordCount);
    }
}
