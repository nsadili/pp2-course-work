public class CommandLineArguments {

    public static void main(String[] args) {

        System.out.println("Arguments passed in:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        if (args.length > 0) {
            int[] nums = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
            printArray(nums);
            int sum = calculateSum(nums);
            double average = (double) sum / nums.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers provided.");
        }

    }

    public static void printArray(int[] nums) {
        System.out.println("Numbers entered:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
