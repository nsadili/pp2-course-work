import java.io.IOException;

public class WordCounterTimeMeasurement {
    public static void main(String[] args) throws IOException, InterruptedException {
        // measure time taken by WordCounterWithoutConcurrency
        long start = System.currentTimeMillis();
        WordCounterWithoutConcurrency.main(args);
        long end = System.currentTimeMillis();
        System.out.println("Time taken by WordCounterWithoutConcurrency: " + (end - start) + " ms");

        // measure time taken by WordCounterWithConcurrency
        start = System.currentTimeMillis();
        WordCounterWithConcurrency.main(args);
        end = System.currentTimeMillis();
        System.out.println("Time taken by WordCounterWithConcurrency: " + (end - start) + " ms");
    }
}
