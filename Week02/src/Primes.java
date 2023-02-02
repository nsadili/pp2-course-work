import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        boolean isPrime = false;
        for(int i=2; i< Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            isPrime=true;
        }

        if(isPrime){
            System.out.println("Prime");
        } else if (!isPrime) {
            if(n==1 || n==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        
    }
}
