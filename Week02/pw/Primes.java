import java.util.Scanner;

public class Primes {
    
    public static void main(String[] args) {

        int flag;
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

       // int x;
        double m = Math.sqrt(n);

        for (int i = 2; i <= m; i++) 

            if (n % i == 0) 
            flag = 1;
                

           if(flag == 1) 
            System.out.println("The number is not Prime!");
            else 
            System.out.println("The number is Prime!");
            
        
    }
        
    }

