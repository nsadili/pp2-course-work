public class CommandLineArgs {
    public static void main(String[] args) {
        // print the arguments passed in
        System.out.println("Arguments passed in are: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        // parse the array of integers
        int[] intArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        // print the array of integers
        System.out.println("Array of Integers: ");
        printArray(intArgs);

        // calculate and print the sum and average
        int sum = getSum(intArgs);
        double avg = getAverage(intArgs);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
    }

    // method to print an array of integers
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}