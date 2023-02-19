package Week04.Arrays;

import java.util.Scanner;

public class GreatandSmall {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println(maxArgElement(args));
            System.out.println(minArgElement(args));
            System.out.println(argsminandmax(args));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The array is:");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(maxScannerElement(numbers));
        System.out.println(minScannerElement(numbers));
        System.out.println(scannerminandmax(numbers));

    }

    private static int maxArgElement(String array[]) {
        int max = Integer.parseInt(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (max < Integer.parseInt(array[i])) {
                max = Integer.parseInt(array[i]);
            }
        }
        return max;
    }

    private static int minArgElement(String array[]) {
        int min = Integer.parseInt(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (min > Integer.parseInt(array[i])) {
                min = Integer.parseInt(array[i]);
            }
        }
        return min;
    }

    private static int maxScannerElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int minScannerElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static String scannerminandmax(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return "Minimum element " + min + ". " + "Maxmimum element " + max + ".";
    }

    private static String argsminandmax(String array[]) {
        int min = Integer.parseInt(array[0]);
        int max = Integer.parseInt(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (min > Integer.parseInt(array[i])) {
                min = Integer.parseInt(array[i]);
            }
            if (max < Integer.parseInt(array[i])) {
                max = Integer.parseInt(array[i]);
            }
        }
        return "Minimum element " + min + ". " + "Maxmimum element " + max + ".";
    }


}



