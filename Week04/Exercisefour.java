package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercisefour {
    public static void main(String[] args) {
    // System.out.println(minimum(args));
       Scanner sc = new Scanner(System.in);
       System.out.println("Please give the number of elements you want to input: ");
       int n = sc.nextInt();
       int[] array = new int[n];
       for (int i = 0; i < n; i++) {
           array[i] = sc.nextInt();
       }

       System.out.println("Min is " + minimum(array));
       System.out.println("Max is " +maximum(array));
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int x: array) {
            if (x > max) max = x;
        }
        return max;
    }
    public static int maximum(String[] array) {
        int max = Integer.parseInt(array[0]);
        for (String x: array) {
            if (Integer.parseInt(x) > max) max = Integer.parseInt(x);
        }
        return max;
    }
    public static int minimum(int[] array) {
        int min = array[0];
        for (int x: array) {
            if (x < min) min = x;
        }
        return min;
    }
    public static int minimum(String[] array) {
        int min = Integer.parseInt(array[0]);
        for (String x : array) {
            if (Integer.parseInt(x) < min) min = Integer.parseInt(x);
        }
        return min;
    }
}