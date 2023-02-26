public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Command line arguments passed in:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    public class CommandLineArray {
        public static void main(String[] args) {
            int[] nums = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
            printIntArray(nums);
            int sum = calculateArraySum(nums);
            double average = sum / (double) nums.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    
        public static void printIntArray(int[] array) {
            System.out.println("Array elements:");
            for (int element : array) {
                System.out.println(element);
            }
        }
    
        public static int calculateArraySum(int[] array) {
            int sum = 0;
            for (int element : array) {
                sum += element;
            }
            return sum;
        }
    }
    
}
