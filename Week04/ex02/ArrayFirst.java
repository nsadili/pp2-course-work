package Week04.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirst {

    public static int maximum (int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int minimum (int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int[] bothOfThem (int[] arr) {
        int min = minimum(arr);
        int max = maximum(arr);

        return new int[] { min, max };
    }

    public static void main(String[] args) { 
        /* 
        FINDING MINIMUM AND MAXIMUM WITHOUT USING METHODS:
         
        int a[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};
        int max = -10000;
        int min = 100000;
        
        for (int i = 0; i < a.length; i++)
        if (a[i] > max) max = a[i];
        
        for (int i = 0; i < a.length; i++)
        if (a[i] < min) min = a[i];
        
        System.out.println("Minimum value in the a is " + min + ", maximum is " + max);
        */

        // Getting input from command line argument
        System.out.println("Please enter the numbers:");
        for (String arg : args) {
            System.out.println(arg);
        }

        int[] arguments1 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arguments1[i] = Integer.parseInt(args[i]);
        }

        System.out.println("The maximum number is: " + maximum(arguments1));
        System.out.println("The minimum number is: " + minimum(arguments1));

        int [] both1 = bothOfThem(arguments1);
        System.out.println("Minimum and maximum nubmers in the array are: " + Arrays.toString(both1));


        // Getting input from Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] arguments2 = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
          arguments2[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The array from Scanner input is: " + Arrays.toString(arguments2));
        System.out.println("Minimum number is: " + minimum(arguments2));
        System.out.println("Maximum number is: " + maximum(arguments2));

        int[] both2 = bothOfThem(arguments2);
        System.out.println("Minimum and maximum nubmers in the array are: " + Arrays.toString(both2));


    }
}
