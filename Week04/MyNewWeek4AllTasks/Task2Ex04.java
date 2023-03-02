import java.util.Scanner;

public class Task2Ex04 {
    public static void main(String[] args) {
        // Take command line arguments and convert into integer array
        // int n = args.length; You can use n instead of args.length
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }

        /* Console Input (Scanner): */

        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt(); // size of array
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++) {
        // arr[i] = scan.nextInt(); // array elements
        // }

        System.out.println(minimum(arr));
        System.out.println(maximum(arr));
        int[] ans1 = minimumAndMaximum(arr);
        System.out.println(ans1[0] + " " + ans1[1]);

        System.out.println(java.util.Arrays.toString(minimumAndMaximum(arr)));
        // if you do only this then it will give you the referance of the values not the
        // values itself!
    }

    /*
     * When you are gonna find minimum / maximum value in an array:
     * -> set a variable that will hold minimum / maximum value (in our example, it
     * is ans)
     * -> assign the first element of array as default (ans = arr[0])
     * -> check all other elements and compare with ans
     * -> if there is a need to change ans value, change it. For example:
     * for(int i=1;i<arr.length;i++) {
     * if(ans > arr[i]) {
     * ans = arr[i];
     * }
     * }
     */
    public static int minimum(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static int maximum(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    /*
     * Technically, you cannot return two values at the same time like:
     * return 1,2;
     * 
     * But you can send them in the form of array:
     * int[] a = {1,2};
     * 
     * return a;
     * 
     * or just
     * 
     * return {1,2};
     * 
     * keep in mind that if you send array like this, indexing will start from zero.
     * that is why we wrote
     * 
     * System.out.println(ans[0]+" "+ans[1]);
     * 
     * in main
     */
    public static int[] minimumAndMaximum(int[] arr) {
        int minVal = minimum(arr);
        int maxVal = maximum(arr);
        int[] res = { minVal, maxVal };

        return res;
    }

}
