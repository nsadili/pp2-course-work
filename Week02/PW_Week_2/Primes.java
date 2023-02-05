import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class Primes{
 public static void main(String[] args) {
 
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num = sc.nextInt();
   int cnt = 1;
   int say=0;
   if(num<0){
       System.out.println("Wrong input");
   }
   else if(num == 1 || num == 2){
       System.out.println("It's prime");
   }
   else{
           while(cnt<=num){
               if(num%cnt==0){
                   say++;
               }
               cnt++;
           }
           if(say>2){
               System.out.println("It's not prime number..");
           }
           else{
               System.out.println("It's prime number..");
           }
   }


      

}
}


