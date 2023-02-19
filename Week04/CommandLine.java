public class CommandLine {
        public static void main(String[] args) {
            if (args.length > 0) {
                System.out.println("Arguments passed in:");
                for (String arg : args) {
                    System.out.println(arg);
                }
            } else {
                System.out.println("No arguments passed in.");
            }
    
            if (args.length > 0) {
                int[] nums = new int[args.length];
                for (int i = 0; i < args.length; i++) {
                    nums[i] = Integer.parseInt(args[i]);
                }
    
                System.out.println("The array of integers entered is:");
                printArray(nums);
    
                int sum = calculateSum(nums);
                double average = (double) sum / nums.length;
    
                System.out.println("The sum of the array is: " + sum);
                System.out.println("The average of the array is: " + average);
            } else {
                System.out.println("No array of integers entered.");
            }
        }
    
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static int calculateSum(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
    

