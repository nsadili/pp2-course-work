package Week04.pw;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        double[] nums;
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter how many numbers you want to input: ");
            int len = sc.nextInt();
            if (len < 1) {
                System.out.println("Ok, bye");
                return;
            }
            nums = new double[len];
            System.out.println("Please enter the numbers.");
            for (int i = 0; i < len; i++) nums[i] = sc.nextDouble();
        } else {
            nums = new double[args.length];
            for (int i = 0; i < args.length; i++) nums[i] = Double.parseDouble(args[i]);
        }
        double[] minMax = minMax(nums);
        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }

    public static double min(double[] nums) {
        double min = Double.MAX_VALUE;
        for (double num : nums) if (num < min) min = num;
        return min;
    }

    public static double max(double[] nums) {
        double max = Double.MIN_VALUE;
        for (double num : nums) if (num > max) max = num;
        return max;
    }

    public static double[] minMax(double[] nums) {
        return new double[] { min(nums), max(nums) };
    }
}
