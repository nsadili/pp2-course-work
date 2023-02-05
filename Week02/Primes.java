import java.util.Scanner;
import java.lang.Math;

public class Primes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        input.close();
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) c = 1;
        }
        if(c == 1 && n != 2) System.out.println("the number is composite");
        else if(n == 1) System.out.println("the number is neither prime not composite");
        else System.out.println("the number is prime");
    }
}
