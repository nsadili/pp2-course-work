import java.util.Scanner;

public class MinMaxExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        int[] array1 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array1[i] = Integer.parseInt(args[i]);
        }
        int min1 = findMinimum(array1);
        int max1 = findMaximum(array1);
        System.out.println("Using command line input:");
        System.out.println("Minimum: " + min1);
        System.out.println("Maximum: " + max1);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        int min2 = findMinimum(array2);
        int max2 = findMaximum(array2);
        System.out.println("Using scanner input:");
        System.out.println("Minimum: " + min2);
        System.out.println("Maximum: " + max2);
        
        int[] array3 = {5, 3, 8, 2, 1, 9};
        int[] minMax = findMinMax(array3);
        System.out.println("Using single method:");
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }

    private static int findMinimum(int[] array1) {
        return 0;
    }
