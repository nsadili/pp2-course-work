import java.util.Scanner;

public class Primes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;

        for (i = 2; i <= Math.sqrt(n); i++)
        {
        if(n%i==0) {
        System.out.printf("Not prime!");
        break;
        }
    }
        if (i>Math.sqrt(n)) System.out.printf("Prime!"); 
        


    
}
}
