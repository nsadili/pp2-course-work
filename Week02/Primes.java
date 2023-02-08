package Week2;
import java.util.*;
public class Primes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
       // 2-den sqrt(n) aras;nda hanlsas edede bolunurse compoistedir
       if(n==1){
        System.out.println("It is composite number");
       }
       for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            count++;
        }
       }if(count>0){
        System.out.println("It is composite number");
       }else{
        System.out.println("It is prime number");
       }
       sc.close();

    }
}
