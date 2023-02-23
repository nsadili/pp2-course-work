package Week04.Arrays.ex;
import java.util.*;
public class CommandLineArguments {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Arguments passed in:");
            int k = in.nextInt();
        }
        for (String arg : args) {
            System.out.println(arg);
        }

    int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        printArray(nums);
        int sum = calculateSum(nums);
        double average = sum / (double) nums.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
    
    public static void printArray(int[] arr) {
        System.out.print("Array: [ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

