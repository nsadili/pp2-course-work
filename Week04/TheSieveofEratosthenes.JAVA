import java.util.Arrays;

public class TheSieveofEratosthenes {
    public static void main(String[] args) {
        int n = 100000;
        int[] array = new int[n];
        Arrays.fill(array, 1);
        array[0] = 0;
        array[1] = 0;
        for (int i = 2; i < n; i++) {
            if (array[i] == 1) {
                for (int j = i + i; j < n; j += i) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                System.out.println(i);
            }
        }
    }
}



 










