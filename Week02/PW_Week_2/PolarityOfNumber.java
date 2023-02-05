import java.util.Scanner;

public class PolarityOfNumber{
    public static void main(String[] args) throws Exception {

     Scanner sc= new Scanner(System.in);

     double number= sc.nextDouble();

     if(number>0){
      System.out.println("Positive");
     }
     else if(number<0){
      System.out.println("Negative");
     }
     else{
      System.out.println("Neutral");
     }
     
    
    }
}
