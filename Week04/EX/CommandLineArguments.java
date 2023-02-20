import java.util.Arrays;

public class CommandLineArguments {
    
    public static void printArray(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }
  
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed in.");
            return;
        }

        if (!args[0].equals("array")) {
            System.out.println("Invalid argument.");
            return;
        }

        
        int[] arr = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            try {
                arr[i-1] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument: " + args[i]);
                return;
            }
        }
     
        printArray(arr);

        int sum = sumArray(arr);
        System.out.println("Sum: " + sum);

        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }
}
