package Week13.note_1;

import java.util.Arrays;

public class SequentialTest {
    public static void main(String[] args) {
        long[] sum = new long[4];

        long before = System.currentTimeMillis();
        for (int i = 1; i <= 4; i++)
            for (int j = 0; j < 10_000_000; j++)
                sum[i - 1] += i * j + Math.pow(i, 3);

        long after = System.currentTimeMillis();

        System.out.println("Time spend " + (after - before) + " millis");
        System.out.println("Result: " + Arrays.stream(sum).sum());
    }
}
