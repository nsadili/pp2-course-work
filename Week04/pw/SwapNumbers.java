import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 7, 2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
