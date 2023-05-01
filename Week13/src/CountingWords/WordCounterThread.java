package CountingWords;

import java.util.List;

public class WordCounterThread implements Runnable {
    public final List<String> lines;
    public int wordCount;

    public WordCounterThread(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public void run() {
        for (String line : lines) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
    }

    public int getWordCount() {
        return wordCount;
    }
}

