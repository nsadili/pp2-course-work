package Week04.ex;

import java.util.Arrays;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Arguments: " + Arrays.toString(args));
        System.out.println("Sum of elements: " + sum(args));
        System.out.println("Average of elements: " + average(args));
    }

    public static int sum(String[] args) {
        int sum = 0;
        for (String x: args) {
            sum += Integer.parseInt(x);
        }
        return sum;
    }

    public static float average(String[] args) {
        return (float) sum(args) / args.length;
    }
}