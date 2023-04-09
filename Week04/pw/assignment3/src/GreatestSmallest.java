import java.util.Scanner;

public class GreatestSmallest {
    public static void main(String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int min = getMin(arr);
        int max = getMax(arr);
        System.out.println("Minimum element of the given array is " + min);
        System.out.println("Maximum element of the given array is " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        min = getMin(arr2);
        max = getMax(arr2);
        System.out.println("Minimum element of the given array is " + min);
        System.out.println("Maximum element of the given array is " + max);

        int[] minMax = getMinMax(arr);
        System.out.println("Minimum and Maximum elements of the given array are " + minMax[0] + " and " + minMax[1]);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] minMax = { min, max };
        return minMax;
    }
}