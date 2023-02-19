
//package taghi_mammadov.week_02;
import java.util.*;
public class Fact {
    public static void main(String args[]){  
        int i,fact=1;  
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input number: " );
            int number = input.nextInt();
            if(number < 0){
                System.out.println("error");
            }
            else{
                for(i=1;i<=number;i++){    
                    fact=fact*i;    
                }    
                System.out.println("Factorial of "+number+" is: "+fact);
            }
         
        }    
       }  
    
}
