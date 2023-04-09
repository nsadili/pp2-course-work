public class CommandLineArgs {
    public static void main(String[] args) {

        System.out.println("Arguments passed in are: ");
        for (String arg : args) {
            System.out.println(arg);
        }

        int[] intArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Array of Integers: ");
        printArray(intArgs);

        int sum = getSum(intArgs);
        double avg = getAverage(intArgs);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
    }

    private static double getAverage(int[] intArgs) {
        return 0;
    }

    private static int getSum(int[] intArgs) {
        return 0;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}