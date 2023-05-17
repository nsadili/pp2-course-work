import java.util.Scanner;

public class MinMaxElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array from command line arguments
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            findMinMax(arr);
        } else {
            // Read array from user input
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.print("Enter the array elements: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            findMinMax(arr);
        }

        scanner.close();
    }

    // Method to find the minimum element in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find both minimum and maximum elements in an array
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] minMax = {min, max};
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        return minMax;
    }
}
