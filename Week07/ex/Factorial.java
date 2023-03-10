import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int number;

        while (scan.hasNextInt()) {
            number = scan.nextInt();

            try {
                System.out.printf("%d! equal to %d", number, factorial(number));
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

       
    }

    static int factorial(int n) {


          
        if(n<0)
        {
            throw new IllegalArgumentException(String.format("  %d! not defined ",n ));
        }

        if (n == 0 || n == 1)
            return 1;



        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        
        return factorial;
    }
}