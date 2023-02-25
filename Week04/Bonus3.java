import java.util.Scanner;
public class Bonus3 {
    public static void main(String[] args) {
        Scanner con = new Scanner (System.in);
        int n = con.nextInt();
        int[] isPrime = new int[n+1];
        // isPrime[i] = 1 -> i is prime, otherwise -> not prime
        for(int i=1; i<=n; i++){
            isPrime[i]  = 1;
        }
        for(int i=2; i<= n; i++) {
            if(isPrime[i] == 1) {
                System.out.print(i+" ");
                for(int j = i*2; j<=n; j = j+1) {
                    isPrime[j] = 0;
                }
            }
        }
        con.close();
    }
}
