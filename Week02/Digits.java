import java.util.*;
public class Digits {
    
  
        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
             int n= scn.nextInt();
            int sum   = 0;
            int mul   = 1;
            int count = 0;
            if (n < 0) 
                n = -n ;
                
            int temp = n; 
            while (n > 0 )
            {
                int digit = n % 10;
                n /= 10;
                sum += digit; 
                mul *= digit;
                count += 1;
            }
            
            if (temp % sum == 0 ) System.out.println("Yes, divisible");
            
            System.out.println(sum);
            System.out.println(mul);
            System.out.println(1.0 * sum / count);
            
        }
    }
    
      

