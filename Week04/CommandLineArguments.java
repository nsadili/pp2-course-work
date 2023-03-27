public class CommandLineArguments {
    
    public static void main(String[] args) {
        
        System.out.println("Command line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
        
        int[] integers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            integers[i] = Integer.parseInt(args[i]);
        }
        
        printArray(integers);
        
        int sum = sumArray(integers);
        System.out.println("Sum of integers: " + sum);
        
        double average = (double) sum / integers.length;
        System.out.println("Average of integers: " + average);
    }
    
    private static void printArray(int[] arr) {
        System.out.println("Array of integers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
}
