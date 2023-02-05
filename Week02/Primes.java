import java.util.*;
import java.lang.Math;
import java.util.Random;
public class Primes {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int flag=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){flag=1; break;
                }}
            if(flag==1 || n==1)System.out.print("Not prime");
            else System.out.print("Prime");
        }
    }
