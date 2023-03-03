import java.util.*;

public class CommandLineArguments {
    
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }
    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println("Argument " + i + ": " + tokens[i]);
        }

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        printArray(nums);
        int sum = sumArray(nums);
        double avg = (double) sum / nums.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
