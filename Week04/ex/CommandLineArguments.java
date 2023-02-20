import java.util.Arrays;
import java.util.Scanner;

public class CommandLineInput {

    public static void main(String[] args) {
        System.out.println("Task (a):");
        System.out.println(Arrays.toString(args));

        System.out.println("\nTask (b):");
        int[] arr = getIntArrayFromCommandLine();
        printIntArray(arr);
        int sum = calculateArraySum(arr);
        double avg = sum * 1.0 / arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }

    public static int[] getArrayFromCommandLine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print((i+1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printIntArray(int[] arr) {
        System.out.print("Array:");
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr[i]);
            if (i != arr.size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
