package PracticalSession;

import java.util.Scanner;

public class W4Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            int min = calculateMin(arr);
            int max = calculateMax(arr);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No command line arguments were passed in.");
        }

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min = calculateMin(arr);
        int max = calculateMax(arr);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }

    public static int calculateMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int calculateMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] calculateMinMax(int[] arr) {
        int[] minMax = new int[2];
        minMax[0] = arr[0]; 
        minMax[1] = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minMax[0]) {
                minMax[0] = arr[i];
            }
            if (arr[i] > minMax[1]) {
                minMax[1] = arr[i];
            }
        }
        return minMax;
    }
}

