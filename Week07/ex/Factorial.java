package ex;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }
    public class FactorialDemo {
        public static void main(String[] args) {
            int n = 5;
            int result = Factorial.factorial(n);
            System.out.println("Factorial of " + n + " is " + result);
        }
    }
    
}
