public class MathDemo {

    public static  int min(int a, int b) {
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
        if (args.length == 0) {
            return 0;
        }
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public static int factorial(int n) {
       if (n == 0 || n == 1) 
        
        return 1;
        
        else 
        
        return n * factorial(n-1);
        
    }
 public static void main(String[] args) {
       

        
        int a = 5, b = 7;
        
        System.out.println("Min of " + a + " and " + b + " is " + min(a, b));

        
        System.out.println("Max of " + a + " and " + b + " is " + max(a, b));

 
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Sum of array is "  + sum(array));

        
        System.out.println("Mean of array is " + mean(array));
        
        int n=5;
        System.out.println("Factorial :" + factorial(n));
    
    }
}