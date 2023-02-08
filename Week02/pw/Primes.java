import java.util.Scanner;

public class Primes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        if(n==0 || n==1) System.out.println("It's not prime number");
        else{
            for(int i = 2; i <= n / 2; i++){
                if (n % i == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 1) System.out.println("It's not prime number");
            else System.out.println("It's prime");
        }
    }
}
