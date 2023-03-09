public class MathDemo {

  // Returns the minimum of two integers
  public static int min(int a, int b) {
    return Math.min(a, b);
  }

  // Returns the maximum of two integers
  public static int max(int a, int b) {
    return Math.max(a, b);
  }

  // Returns the sum of an array of integers
  public static int sum(int[] args) {
    int result = 0;
    for (int arg : args) {
      result += arg;
    }
    return result;
  }

  // Returns the mean (average) of an array of integers
  public static float mean(int[] args) {
    if (args.length == 0) {
      return 0;
    }
    int sum = sum(args);
    return (float) sum / args.length;
  }

  // Returns the factorial of an integer
  public static int factorial(int n) {
    if (n < 0) {
      System.out.println("Factorial is undefined for negative numbers.");
    }
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;

  }
  
}
