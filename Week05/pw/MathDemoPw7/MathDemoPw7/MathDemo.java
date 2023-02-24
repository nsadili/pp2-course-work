package MathDemoPw7;
public class MathDemo {
        
    public static int Min(int a, int b) {

    return a < b ? a : b;

    }

     public static int Max(int a, int b) {

    return a > b ? a : b;

    }

    public static int Sum(int[] arrays) {

        int sum = 0;
        
       for(int i = 0; i < arrays.length; i++) {
       
            sum += arrays[i];
       }
        return sum;
    }

    public static int Mean(int[] arrays) {

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < arrays.length; i++) {
        
             sum += arrays[i];
             cnt++;
        }
         return sum / cnt;
     }

    public static int factorial(int n) {
        
        int res = 1;
        
        for(int i = n; i >= 1; i--)
        res *= i;
       return res;
    }
}