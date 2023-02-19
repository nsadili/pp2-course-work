package Week04;

import java.util.Arrays;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Arguments: " + Arrays.toString(args));
        System.out.println("Sum of the elements: " + sum(args));
        System.out.println("Average of the elements: " + average(args));
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