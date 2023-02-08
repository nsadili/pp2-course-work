package Week2;
import java.util.*;
public class Fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        if(a<0){
            System.out.println("Sorry, this number cannot be factorized.");
        }else{
            //5! = 5*4*3*2*1
            for(int i=1; i<=a; i++){
                fact = fact*i;
            }
            System.out.println(a+"! = "+fact);

            System.out.print(a+"! = ");
            for(int i=1; i<=a; i++){
                fact=fact*i;
                if(i==a){
                System.out.print(i);  
                continue; 
                }
               System.out.print(i+"*"); 
            }
            
        }

        sc.close();
    }
}
