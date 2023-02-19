package Week04.ex;

public class CommandLineArgument {
    public static void main(String[] args) {
        System.out.println("The arguments passed in are: ");
        for (String arg : args) {
            System.out.println(arg);
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        printArray(numbers);
        int sum = calculateSum(numbers);
        System.out.println("The sum of the array elements is: " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("The average of the array elements is: " + average);
    }

    public static void printArray(int[] array) {
        System.out.println("The array passed in is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
