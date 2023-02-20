import java.util.Scanner;

public class GreatestAndSmallestElements {
    
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    
    public static int findMaximum(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // // Read array from command line arguments
        // int[] arr1 = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        //     arr1[i] = Integer.parseInt(args[i]);
        // }
        // int min1 = findMinimum(arr1);
        // int max1 = findMaximum(arr1);
        // System.out.println("Minimum of array 1: " + min1);
        // System.out.println("Maximum of array 1: " + max1);
        
        // Read array from Scanner object
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        int min2 = findMinimum(arr2);
        int max2 = findMaximum(arr2);
        System.out.println("Minimum of array 2: " + min2);
        System.out.println("Maximum of array 2: " + max2);
        
        scanner.close();
    }
}
