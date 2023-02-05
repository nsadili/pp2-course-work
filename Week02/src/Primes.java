import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        if (n == 1) {
            System.out.println("Neither prime nor compound");
            return ;
        }

        boolean isPrime = true;
        for(int i=2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }

        }

        if(isPrime){
            System.out.println("Prime");
        }
        else{
                System.out.println("Not Prime");
            }


    }
}