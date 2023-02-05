import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add a number!");
        int n = sc.nextInt();
        int flag=0;

        for (int i=2; i<=Math.sqrt(n);i++)
        {
            if ((n%i)==0) flag=1;
        }
        if (flag==1) System.out.println("It is not Prime!"); else System.out.println("It is Prime!");
    }
}
