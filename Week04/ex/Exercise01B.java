package Week04.ex;

public class Exercise01B {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: no input provided.");
            return;
        }
        int[] ints = new int[args.length];
        for (int i = 0; i < args.length; i++) ints[i] = Integer.parseInt(args[i]);
        printIntegers(ints);
        System.out.println("The sum is: " + sumIntegers(ints));
        System.out.println("The average is: " + (double)sumIntegers(ints) / ints.length);
    }

    public static void printIntegers(int[] ints) {
        for (int i : ints) System.out.print(i + " ");
        System.out.println();
    }

    public static int sumIntegers(int[] ints) {
        int sum = 0;
        for (int i : ints) sum += i;
        return sum;
    }
}
