public class Exercise {
    public static void main(String[] args) {
        System.out.println("Command line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }

        if (args.length > 0) {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            printIntArray(numbers);

            int sum = calculateSum(numbers);
            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers provided.");
        }
    }

    public static void printIntArray(int[] array) {
        System.out.println("Array of integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

