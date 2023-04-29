package week13.exercise1;

import week13.exercise1.FileCount;

import java.util.StringTokenizer;

public class ParallelProcessor extends Thread {
    String text;

    public ParallelProcessor(String text) {
        this.text = text;
    }

    // getCount()

    public void run() {
        StringTokenizer st = new StringTokenizer(text);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.length() > 3) {
                FileCount.increment();
            }
        }
    }
}
