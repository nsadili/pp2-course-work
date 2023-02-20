package Arrays;
import java.util.Arrays;

public class Swapping {
    public static void main(String args[]) {
        int arr[] = {1,0,1,4,6,4,5,-4,4,3,-2,9,5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        // Most repeated number:
        int n = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int cnt = 0;
            while (arr[i] == arr[i + 1]) {
                cnt++; i++;
            }
            if (cnt > max) {
                max = cnt;
                n = arr[i];
            }
        }
        System.out.println(n);
    }
}
