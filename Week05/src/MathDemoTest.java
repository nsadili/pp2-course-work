package Week05.src;

import java.util.*;

public class MathDemoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathDemo math = new MathDemo();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = math.min(num1, num2);
        int max = math.max(num1, num2);
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = math.sum(nums);
        float mean = math.mean(nums);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

        int factorial = math.factorial(n);
        System.out.println(n + "! = " + factorial);

    }
}
