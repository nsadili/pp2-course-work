

public class SumAndAverage {
    public static void main(String[] args) {
        int[] nums = new int[args.length]; // create an array of integers to store the input
        int sum = 0; // initialize the sum to zero
        
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]); // convert each input string to an integer
            sum += nums[i]; // add each number to the sum
        }
        
        double avg = (double) sum / args.length; // calculate the average
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
