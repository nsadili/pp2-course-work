import java.util.Scanner;

public class Primes {
    
    public static void main(String[] args) {

        int flag = 0;
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double m = Math.sqrt(n);

        for (int i = 2; i < n; i++) 

            if (n % i == 0 && n != 1) 
             flag = 1;
      
            if (flag == 1)
            System.out.println("The number is not Prime!");
            else if (n != 1)
            System.out.println("The number is Prime!");

             if (n == 1)
        System.out.println("Inconclusive!");
        
    }
        
    }

