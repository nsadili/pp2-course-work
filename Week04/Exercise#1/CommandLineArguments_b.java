import java.util.Scanner;

public class CommandLineArguments_b {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        input.close();

        printArray(numbers);
        int sum = calculateSum(numbers);
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}