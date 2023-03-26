package Week05.pw;

public class MathDemoRunner {
    public static void main (String[] args) {
    MathDemo math = new MathDemo();
    int result1 = math.Min(5, 3); // returns 3
    System.out.printf("min(%d, %d) = %d", 5, 3, result1);

    int result2 = math.Max(5, 3); // returns 5
    System.out.printf("max(%d, %d) = %d", 5, 3, result2);
    
    int[] nums = {1, 2, 3, 4, 5};
    int result3 = math.Sum(nums); // returns 15
    System.out.println("Sum of " + Arrays.toString(nums) + " = " + result3);

    float result4 = math.mean(nums); // returns 3.0
    System.out.println("Mean of " + Arrays.toString(nums) + " = " + result4);

    int result5 = math.factorial(5); // returns 120
    System.out.println("Factorial of 5 = " + result5);
}
    
}
