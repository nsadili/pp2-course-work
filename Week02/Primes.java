import java.util.*;
public class Primes {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cnt=0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) cnt++; break;
        }
        if(cnt >= 1)  System.out.println("Not prime ");
        else System.out.println("Prime");
    }
}
