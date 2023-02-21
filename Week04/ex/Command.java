import java.util.Scanner;

public class Command {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i+1) + ": ");
                arr[i] = scanner.nextInt();
            }

          
            printArray(arr);
            int sum = calculateSum(arr);
            double average = (double) sum / size;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
