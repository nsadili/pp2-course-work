public class MathDemo {

   
    public static int min(int a, int b) {
      return Math.min(a, b);
    }
  
    public static int max(int a, int b) {
      return Math.max(a, b);
    }
  
   
    public static int sum(int[] args) {
      int result = 0;
      for (int arg : args) {
        result += arg;
      }
      return result;
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
        System.out.println("Factorial is undefined for negative numbers.");
      }
      int result = 1;
      for (int i = 1; i <= n; i++) {
        result *= i;
      }
      return result;
  
    }
    
  } 
  
    

