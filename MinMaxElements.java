import java.util.Scanner;

public class MinMaxElements {
    
    public MinMaxElements() {
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // read array from command line arguments
            int[] arr1 = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr1[i] = Integer.parseInt(args[i]);
            }
            
            // read array from user input
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            int[] arr2 = new int[size];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < size; i++) {
                arr2[i] = scanner.nextInt();
            }
            
            // find min and max elements of the arrays
            int min1 = findMin(arr1);
            int max1 = findMax(arr1);
            int min2 = findMin(arr2);
            int max2 = findMax(arr2);
            
            // print the results
            System.out.println("Minimum element of array 1: " + min1);
            System.out.println("Maximum element of array 1: " + max1);
            System.out.println("Minimum element of array 2: " + min2);
            System.out.println("Maximum element of array 2: " + max2);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
