package Week04;
import java.util.Arrays;
public class ClassPractical {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 1234567;
        while (n > 0) {
            arr[n % 10] += 1;
            n = n / 10;
        }
        System.out.println(Arrays.toString(arr));
    }
}

