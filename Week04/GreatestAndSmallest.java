import java.util.Scanner;

public class GreatestAndSmallest {
    
    public static int findmin(int[] array) {
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }
    
    public static int findmax(int[] array) {
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the number of elements in the array:");
        int a = scanner.nextInt();
        int[] array2 = new int[a];
        System.out.print("Please, enter the elements of the array:");
        for (int j = 0; j < a; j++) {
            array2[j] = scanner.nextInt();
        }
        int min2 = findmin(array2);
        int max2 = findmax(array2);
        System.out.println("Minimum of array is: " + min2);
        System.out.println("Maximum of array is: " + max2);
        
    }
}