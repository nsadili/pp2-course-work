import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please, enter a value");
            System.exit(1);

        }
        System.out.println(Arrays.toString(args));
        int numbers[] = new int[args.length];
        for (int j = 0; j < args.length; j++) {
            numbers[j] = Integer.parseInt(args[j]);
        }
        printArray(numbers);
        System.out.println(sum(numbers));
    }

    private static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    private static int sum(int[] array) {

        var sum = 0;
        for (var el : array) {
            sum += el;

        }
        return sum;

    }
}