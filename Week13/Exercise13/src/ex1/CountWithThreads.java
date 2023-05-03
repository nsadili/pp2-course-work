package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

class Parallel extends Thread {
    private String str;

    public Parallel(String str) {
        this.str = str;
    }

    public void run() {
        String words[] = str.split("\\s");
        
        for (String x: words) {
            if (x.length() > 3)
                Count.increase();
        }
    }
}

class Count {
    private static int count = 0;

    public static void increase() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class CountWithThreads {
    public int count = 0;
    public static void main(String[] args) {
        String line = "", text = "";
        int lineCnt = 1;
        List<Parallel> threads = new LinkedList<>();

        long start = System.currentTimeMillis();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./Exercise13/src/data/text.txt"));

            while ((line = reader.readLine()) != null) {
                text +=line;
                if (lineCnt++ == 300) {
                    String input = new String(text);
                    Parallel prlCnt = new Parallel(input);
                    threads.add(prlCnt);
                    prlCnt.start();
                    text = ""; lineCnt = 1;
                }
            }

            reader.close();

            if (lineCnt > 0) {
                String input = new String(text);
                Parallel prlCnt = new Parallel(input);
                threads.add(prlCnt);
                prlCnt.start();
            }

            for (Parallel x: threads)
                x.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));

        System.out.println(Count.getCount());
    }
}