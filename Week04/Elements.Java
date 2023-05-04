public main class Elements{

    public static int findMinimum(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
       }
        return min;
    }

    public static int findMaximum(int[ nums]) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    

    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int min = findMinimum(nums);
        int max = findMaximum(nums);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            nums[i] = scanner.nextInt();
        }
        int min = findMinimum(nums);
        int max = findMaximum(nums);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public class MinMax{
        public int min;
        public int max;
        
        public MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
    
    public static MinMax findMinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return new MinMax(min, max);
    }
}