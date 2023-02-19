package Week04.Arrays;

import java.sql.SQLOutput;

public class CLA {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        printArray(numbers);
        System.out.println();
        System.out.println(sumofArray(numbers));

    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int sumofArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
