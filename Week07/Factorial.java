package Week07;

public class Factorial {
    public static int factorial(int s) {
        if (s == 0) {
            return 1;
        } else {
            return s * factorial(s-1);
        }
    }
    
}
