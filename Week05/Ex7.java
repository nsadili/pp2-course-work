package Week05;

public class Ex7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int n = 6;
        int minResult = MathDemo.min(a, b);
        int maxResult = MathDemo.max(a, b);
        int[] numbers = {a, b};
        int sumResult = MathDemo.sum(numbers);
        int[] number2 = {a, b};
        float meanResult = MathDemo.mean(number2);
        int factorialResult = MathDemo.factorial(n);
        System.out.println("The minimum of " + a + " and " + b + " is " + minResult);
        System.out.println("The maximum of " + a + " and " + b + " is " + maxResult);
        System.out.println("The sum of " + a + " and " + b + " is " + sumResult);
        System.out.println("The mean of " + a + " and " + b + " is " + meanResult);
        System.out.println("The factorial of " + n + " is " + factorialResult);
    }
    
class MathDemo {
    
    public static boolean areEqual(String s1, String s2) {
        return s1.equals(s2);
    }
        public static int min(int a, int b) {
            return Math.min(a, b);
        }
        
        public static int max(int a, int b) {
            return Math.max(a, b);
        }
        
        public static int sum(int[] args) {
            int sum = 0;
            for (int i : args) {
                sum += i;
            }
            return sum;
        }
        
        public static float mean(int[] args) {
            if (args.length == 0) {
                return 0;
            }
            int sum = sum(args);
            return (float) sum / args.length;
        }
        
        public static int factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Factorial not defined for negative numbers.");
            }
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
    


/*The advantage of defining these methods as static is that they can be called without needing to create an instance of the MathDemo class.
 */
