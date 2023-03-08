package pw;
public class math {
  
    public int min(int a, int b) {
      return Math.min(a, b);
    }
    
    public int max(int a, int b) {
      return Math.max(a, b);
    }
    
    public int sum(int[] args) {
      int sum = 0;
      for (int i = 0; i < args.length; i++) {
        sum += args[i];
      }
      return sum;
    }
    
    public float mean(int[] args) {
      return (float) sum(args) / args.length;
    }
    
    public int factorial(int n) {
      int result = 1;
      for (int i = 2; i <= n; i++) {
        result *= i;
      }
      return result;
    }
    
  }
  