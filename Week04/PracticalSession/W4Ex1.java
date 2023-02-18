package PracticalSession;

public class W4Ex1 {
    public static void main(String[] args) {
        if (args.length > 0) {
        
            System.out.println("Arguments passed in:");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            printIntArray(arr);
            int sum = calculateSum(arr);
            double avg = (double) sum / arr.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        } else {
            System.out.println("No command line arguments were passed in.");
        }
    }

    public static void printIntArray(int[] arr) {
        System.out.print("Array: ");
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

