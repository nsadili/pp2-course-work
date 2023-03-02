import java.util.Scanner;

public class ElementFinder {

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
        int[] minMax = new int[2];
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }

    public static void main(String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr2 = new int[size];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }
            min = findMin(arr2);
            max = findMax(arr2);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        int[] arr3 = { 3, 6, 1, 8, 2, 10 };
        int[] minMax = findMinMax(arr3);
        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }
}
