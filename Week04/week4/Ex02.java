package pp2.week4;

import java.util.Scanner;

public class Ex02 {
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

    public static void getAndPrintMinMax() {
        Scanner scanner = new Scanner(System.in);
        int len;
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int[] findMinMax(int[] arr) {
        int[] result = new int[2];
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
    
}
