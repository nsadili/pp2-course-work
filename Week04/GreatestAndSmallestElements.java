package Week04;

import java.util.Scanner;

public class GreatestAndSmallestElements {
    static int[] arr = new int[999];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextInt()) {
            arr[i++] = sc.nextInt();
        }
        System.out.println("The mininum value from scanner input is: " + minimum(arr));
        System.out.println("The maximum value from scanner input is: " + maximum(arr));
        if (args.length != 0) {
            System.out.println("The mininum value from argument input is: " + minimum(args));
            System.out.println("The maximum value from argument input is: " + maximum(args));
        }
        System.out.println("The minimum and maximum value from scanner input are: " + minandmax(arr));
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int x : array) {
            if (x < min) min = x;
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int x : array) {
            if (x > max) max = x;
        }
        return max;
    }

    public static int minimum(String[] array) {
        int min = Integer.parseInt(array[0]);
        for (String x : array) {
            if (Integer.parseInt(x) < min) min = Integer.parseInt(x);
        }
        return min;
    }

    public static int maximum(String[] array) {
        int max = Integer.parseInt(array[0]);
        for (String x : array) {
            if (Integer.parseInt(x) > max) max = Integer.parseInt(x);
        }
        return max;
    }

    public static String minandmax(int[] array) {
        int[] answer = new int[2];
        int min1 = array[0];
        int max2 = array[0];
        for (int x : array) {
            if (x < min1) min1 = x;
            if (x > max2) max2 = x;
        }
        return "Min: " + min1 + ". Max: " + max2;
    }
}
