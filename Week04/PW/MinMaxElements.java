import java.util.Scanner;

public class MinMaxElements {
    
    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] minMaxElements(int[] arr) {
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
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("No arguments passed in.");
            return;
        }

        int[] arr1 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr1[i] = Integer.parseInt(args[i]);
        }

        int min1 = minElement(arr1);
        int max1 = maxElement(arr1);

        System.out.println("Min element of array1: " + min1);
        System.out.println("Max element of array1: " + max1);

        System.out.print("Enter size of array2: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        System.out.print("Enter elements of array2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int min2 = minElement(arr2);
        int max2 = maxElement(arr2);

        System.out.println("Min element of array2: " + min2);
        System.out.println("Max element of array2: " + max2);

        int[] minMax = minMaxElements(arr1);

        System.out.println("Min and max elements of array1: " + minMax[0] + ", " + minMax[1]);
    }
}
