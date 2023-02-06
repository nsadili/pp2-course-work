import java.util.Random;
import java.util.Scanner;

public class coin {
    public static void main(String[] args){
Scanner scan= new Scanner(System.in);
   Random ran= new Random();
   int suret=0,mexrec=0;
  
   int n= scan.nextInt();

   for(int i=0;i<n;i++){
    int coin=ran.nextInt(2)+1; 
if(coin==1) {
    suret++;
}




   }
   
   System.out.println("Probability of showing heads: " +suret+"/"+n);
   System.out.println("Probability of showing tails: " +(n-suret)+"/"+n);
    }
}
