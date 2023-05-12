package Week13.note_1;
import java.util.Arrays;

public class DynamicParallelTest {
    public static void main(String args[]) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);
        Parallel t[] = new Parallel[cores];

        long before = System.currentTimeMillis();
        for (int i = 0; i < cores; i++) {
            t[i] = new Parallel(i + 1, "Thread #" + i);
            t[i].start();
        }

        try {
            for (int i = 0; i < cores; i++)
                t[i].join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted: " + ex);
        }

        long after = System.currentTimeMillis();

        System.out.println("Time spend " + (after - before) + " millis");

        long sum = Arrays.stream(t).mapToLong(p -> p.getSum()).sum();
        System.out.println("Result: " + sum);
    }
}
