public class Task1Ex04 {
    public static void printArray(int[] arr) {
        // just go through all indexes and print elements at these indexes
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        // store a variable to hold sum, and sum up all elements
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            res = res + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int n = args.length; // size of args
        int[] arr = new int[n]; // integer array
        for(int i=0; i<n; i++) { // index range: [0 ... n-1]
            /*
                By default, command line arguments (String[] args) are String objects.
                We will do mathematical operations, therefore we need to convert them into integer.
             */
            arr[i] = Integer.valueOf(args[i]);
        }
        printArray(arr);
        System.out.println(sum(arr));
    }
}