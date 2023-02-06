import java.util.Scanner;
import java.math.*;

public class TaylorSin {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x = scan.nextFloat();
        int n = scan.nextInt();

        int pow_number = 1;
        int fact_number = 1;
        int res = 0;
        
        for(int i = 1; i <= n; i++) {
            fact_number *= i;
        }

        for(int i = 1; i <= n; i++) {
            pow_number *= x;
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) 
            res += pow_number / fact_number;
        }
            
           System.out.println(res); 
        
        
    }
    
}
