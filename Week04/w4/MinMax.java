
import java.util.Scanner;

public class MinMax {
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int[] findMinMax(int[] arr) {
    int[] result = new int[2];
    result[0] = findMin(arr);
    result[1] = findMax(arr);
    return result;
}

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);

        int[] result = findMinMax(arr);
        System.out.println("Minimum element in array: " + result[0]);
        System.out.println("Maximum element in array: " + result[1]);
    }
}

private static int findMin(int[] arr) {
    return 0;
}
}