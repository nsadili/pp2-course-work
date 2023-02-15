//package Week04.ex;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please, enter an integer");
            System.exit(1);
        }

        int numbers[] = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        printArr(numbers);

        System.out.println(sumArr(numbers));

    }

    static void printArr(int[] arr) {
        for (var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int sumArr(int[] arr) {
        var sum = 0;
        for (var el : arr) {
            sum += el;
        }
        return sum;
    }
}
