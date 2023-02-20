package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static int findSum(int arr[]) {
        int s = 0;
        for (int x: arr) {
            s += x;
        }
        return s;
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
        printArray(arr);
        System.out.println(findSum(arr));
    }
}
