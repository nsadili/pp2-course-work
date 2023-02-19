import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        // int arr[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0 };
        // int[] arr = new int[100];
        int maximum, minimum, count;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }
        maximum = minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            } else if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.printf("min=%d max=%d", minimum, maximum);
    }
}
