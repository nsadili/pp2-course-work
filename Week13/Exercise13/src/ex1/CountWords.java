package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        String text = "";
        int count = 0;

        long start = System.currentTimeMillis();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./Exercise13/src/data/text.txt"));

            while ((text = reader.readLine()) != null) {
                count += countWords(text);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));

        System.out.println(count);
    }

    public static int countWords(String str) {
        String words[] = str.split("\\s");
        int cnt = 0;
        
        for (String x: words) {
            if (x.length() > 3)
                cnt++;
        }

        return cnt;
    }
}
