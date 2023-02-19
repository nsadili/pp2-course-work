import java.util.Scanner;

public class GreatandSmall {
    public static int calculateMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }

        return min;
    }

    public static int calculateMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] MinMax(int arr[], int n) {
        int[] values = new int[2];
        
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        values[0] = max;
        values[1] = min;
    
        return values;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element" + (i + 1) + ":");
            arr[i] = scan.nextInt();
        }
        int min = calculateMinimum(arr);
        int max = calculateMaximum(arr);
        System.out.println("Minimum value:" + min);
        System.out.println("Maximum value:" + max);

    }
}