import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Create an array to store the integers entered by the user
        int[] arr = new int[size];
        
        // Prompt the user to enter the array elements
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        // Call the findMinimum method to calculate the minimum value
        int min = findMinimum(arr);
        
        // Print the minimum value
        System.out.println("The minimum value is: " + min);
        
        input.close();
    }
    
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
