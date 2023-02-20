package pp2.week04;

public class CommandLineArguments {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please, provide arguments");
            System.exit(1);
        }

        // Part a
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();

        // Part b
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // i part
        printArray(numbers);
        // ii part
        System.out.println("sum = " + sum(numbers));
    }

    private static void printArray(int[] arr) {
        for (var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (var el : arr) {
            sum += el;
        }
        return sum;
    }
}