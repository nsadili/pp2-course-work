package EX;

public class array {
    public class Array {
        public static void main(String[] args) {
            if (args.length == 0) {

                return;
            }

            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            printArray(arr);

            int x = sumArray(arr);
            double z = x / (double) arr.length;
            System.out.println(x);
            System.out.println(z);
        }

        public static void printArray(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
            System.out.print("\n");
        }

        public static int sumArray(int[] arr) {
            int x = 0;
            for (int i = 0; i < arr.length; i++) {
                x += arr[i];
            }
            return x;
        }
    }
}
