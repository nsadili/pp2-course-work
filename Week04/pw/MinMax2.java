package Week04.pw;

public class MinMax2 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 5, 6, 8, 7, 9};
        System.out.println("Maximum number in array is: " + findMaximum(arr));
        System.out.println("Minumum number in array is: " + findMinumum(arr));

    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMinumum(int[] arr) {
        
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}