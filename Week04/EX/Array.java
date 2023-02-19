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

        int sum = sumArray(arr);
        double avg = sum / (double) arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }

    public static void printArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
