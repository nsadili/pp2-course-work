package Week05.PW;

public class MathDemo {
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
    
    public static float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
    
    public static int factorial(int n) {
        if (n < 0) {
            System.out.print("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    //The advantage of defining these methods 
    //as static is that they can be used anywhere 
    //in your code without needing to create a new 
    //instance of the MathDemo class each time you want 
    //to use them. This can make your code more efficient
    // and easier to read, as you don't need to worry about 
    //creating unnecessary objects. Additionally, because 
    //static methods are associated with the class rather 
    //than with individual objects, they can be called even 
    //if you don't have a reference to an object of that class.
}