package week04;

import java.util.Scanner;

public class GreatestAndSmallest {
  
    public static int min(int[] arr) {
        int res = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(res > arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }


    public static int max(int[] arr) {
        int res = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(res < arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }
  
    public static int[] MinAndMax(int[] arr) {
        int minVal = min(arr);
        int maxVal = max(arr);
        int[] res = {minVal, maxVal};
        return res;
    }

    public static void main(String[] args) {
        int n = args.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }

        /* Console Input (Scanner): */

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // size of array
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt(); // array elements
//        }

        System.out.println(min(arr));
        System.out.println(max(arr));
        int[] res = MinAndMax(arr);
        System.out.println(res[0]+" "+res[1]);
    }
}
