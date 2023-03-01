import java.util.Scanner;
public class Primes {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0 && a % 4 == 0 && a % 5 == 0 && a % 10 == 0 && a % 20 == 0 &&a % 25 == 0 && a % 50 == 0 )
        {
            System.out.println("Yes, "+ a + " is prime.");
        }
        else System.out.println("No, "+a+  "  is not prime.");

    }
    
}