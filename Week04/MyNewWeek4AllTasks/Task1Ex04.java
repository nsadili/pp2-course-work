public class Task1Ex04 {
    public static void main(String[] args) {
       // args.length; // size of args
        int[] arr = new int[args.length]; // integer array
        for(int i=0; i<args.length; i++) { // index range: [0 ... args.length-1]
            /*
                By default, command line arguments (String[] args) are String objects.
                We will do mathematical operations, therefore we need to convert them into integer.
             */
            arr[i] = Integer.valueOf(args[i]);
        }
        printArray(arr);
        System.out.println(sum(arr));
        System.out.println(ave(arr));
    }

    public static void printArray(int[] arr) {
        // just go through all indexes and print elements at these indexes
        System.out.println("The array of Integers: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        // store a variable to hold sum, and sum up all elements
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double ave(int[] arr) {
        
        return sum(arr) / arr.length;
    }

}