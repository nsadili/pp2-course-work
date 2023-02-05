import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i = 2; i < a; i++) {
            
           if (a % i == 0){count++;}
}

if (count != 0) {

    System.out.println("The number is not prime");
    
} else {

    System.out.println("The number is prime");
    
}






    }
}
