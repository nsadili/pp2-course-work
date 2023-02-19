public class CommandLineArguments {
    
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Enter at least one integer!");
            System.exit(1);
        }

        int num[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        printArr(num);

        System.out.println("Sum: " + sumArr(num));
        System.out.println("Average: " + averageArr(num));
    }

    
    private static void printArr(int[] arr) {
        for (int x : arr)
        System.out.println(x + " ");
        System.out.println();
    }

    private static int sumArr(int[] arr) {
        int sum = 0;
        for (int x : arr)
        sum += x;

        return sum;
    }

    private static double averageArr(int[] arr) {
        return (double) sumArr(arr) / arr.length;
    }
}
