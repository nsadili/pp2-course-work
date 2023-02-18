import java.util.Arrays;
import java.util.Scanner;

public class Min_Max{      

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the size of array: ");
        int sizeElements = scanner.nextInt();

        int[] numbers = new int[sizeElements]; 

        for (int i = 0; i < sizeElements; i++) {
            System.out.print("Write the element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

}

    public static int findMin (int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    
    public static int findMax (int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}