public class Exercise1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter, at least an integer");
            System.exit(1);
        }
        int numbers[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
    }

    private static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
        System.out.println();
    }

    private static int sumArr(int[] arr) {
        int sum = ;
    }
}