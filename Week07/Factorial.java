import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        try{
            if(factorial(n)>0);
        } 
        catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
        System.out.printf("The factorial of %d is %d ", n ,factorial(n));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number should not be negative.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
