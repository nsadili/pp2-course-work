package exer.Counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wordcounter {

    public static void main(String[] args) {
        String rndmfile = "rndmfile.txt";
        long startTime = System.nanoTime();
        int wordCount = countWords(rndmfile);
        long endTime = System.nanoTime();
        System.out.println("Word count: " + wordCount);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
    }

    public static int countWords(String rndmfile) {
        Counter cnt = new Counter();
        try {
            File file = new File(rndmfile);
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);

            String ln;
            while ((ln = bufferedreader.readLine()) != null) {
                String[] words = ln.split(" ");
                for (String word : words) {
                    if (word.length() > 3) {
                        cnt.increment();
                    }
                }
            }

            bufferedreader.close();
            filereader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cnt.getValue();
    }

}
