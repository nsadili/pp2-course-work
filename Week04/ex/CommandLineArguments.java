public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            printArray(arr);
            System.out.println("The sum of the array elements is: " + sumArray(arr));
            System.out.println("The average of the array elements is: " + averageArray(arr));
        } else {
            System.out.println("No arguments passed in.");
        }
    }
    
    public static void printArray(int[] arr) {
        System.out.println("The array of integers is:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static double averageArray(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        return (double) sumArray(arr) / arr.length;
    }
}
