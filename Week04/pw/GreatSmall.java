import java.util.Scanner;

public class GreatSmall {
    
    public static int calculateMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int calculateMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    public static int[] calculateMinMax(int[] array) {
        int[] result = new int[2];
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
    
    public static void main(String[] args) {
        
        int[] array1 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array1[i] = Integer.parseInt(args[i]);
        }
        int min1 = calculateMin(array1);
        int max1 = calculateMax(array1);
        System.out.println("Minimum of array1 is " + min1);
        System.out.println("Maximum of array1 is " + max1);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array2: ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        System.out.print("Enter the elements of array2: ");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        int min2 = calculateMin(array2);
        int max2 = calculateMax(array2);
        System.out.println("Minimum of array2 is " + min2);
        System.out.println("Maximum of array2 is " + max2);
        
        int[] result = calculateMinMax(array2);
        System.out.println("Minimum of array2 is " + result[0]);
        System.out.println("Maximum of array2 is " + result[1]);
    }
}
