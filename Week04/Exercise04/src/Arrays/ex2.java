package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ex2 {
    public static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static String findMinAndMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return "Minimum: " + min + ", Maximum: " + max;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of elements:");
        int n = scan.nextInt();
        System.out.println("Insert elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println(findMinAndMax(arr));
    }
}
