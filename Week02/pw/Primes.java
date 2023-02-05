import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            boolean primeornot = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    primeornot = false;
                    break;
                }
            }
            if (primeornot) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}