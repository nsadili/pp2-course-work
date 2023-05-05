public class MathDemo {
    
    // method to return the minimum of two integers
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    
    // method to return the maximum of two integers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    // method to return the sum of an array of integers
    public int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
    
    // method to return the mean of an array of integers
    public float mean(int[] args) {
        float sum = sum(args);
        return sum / args.length;
    }
    
    // method to return the factorial of an integer
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    
    // static methods do not require an instance of the class to be created
    // they can be called using the class name directly
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // create an instance of MathDemo
        MathDemo math = new MathDemo();
        
        // call instance methods
        int min = math.min(10, 5);
        int max = math.max(10, 5);
        int sum = math.sum(numbers);
        float mean = math.mean(numbers);
        int factorial = math.factorial(5);
        
        // call static methods (without creating an instance)
        // static methods are useful for utility classes or methods
        int staticMin = Math.min(10, 5);
        int staticMax = Math.max(10, 5);
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Factorial: " + factorial);
        System.out.println("Static Min: " + staticMin);
        System.out.println("Static Max: " + staticMax);
    }
}
