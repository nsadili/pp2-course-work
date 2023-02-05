import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= scan.nextInt();
        int cnt=0;
        if(n<=1) {
            System.out.println("Please, enter number bigger than 1");
            System.exit(1);
        }
        if(n>=1) {
            for(int i=2; i<n; i++) {
                if(n%i==0) cnt++;
            }
        }
        if(cnt==0) System.out.println("The number is prime");
        else System.out.println("The number is not prime");
    }
}
