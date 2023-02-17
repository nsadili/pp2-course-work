import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int min = min(arr, n);
        int max = max(arr, n);
        int [] minmax = minmax(arr, n);

        System.out.println("MIN"+min);
        System.out.println("MAX"+max);
       // System.out.println(ArraytoString(minmax));
    }


    static int min(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }

    static int max(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;

    }

    static int[] minmax(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int res[] = new int[2];
        res[0] = min;
        res[1] = max;
        return res;

    }

}
