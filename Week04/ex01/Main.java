package Week04.ex01;
import java.util.Arrays;

public class Main {
    public static void printIntArray(int[] arr) {
        System.out.println("The array of integers is:");
        System.out.println(Arrays.toString(arr));
    }


    public static int sumIntArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
          sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The command line arguments are:");
        for (String arg : args) {
          System.out.println(arg);
        }

        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
          nums[i] = Integer.parseInt(args[i]);
        }
        printIntArray(nums);
        int sum = sumIntArray(nums);
        double avg = (double) sum / nums.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}

