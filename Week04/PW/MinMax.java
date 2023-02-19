import java.util.Scanner;

public class MinMax {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] minMax = findMinMax(arr);
        System.out.println(minMax[0]);
        System.out.println(minMax[1]);
        scanner.close();
    }
}
