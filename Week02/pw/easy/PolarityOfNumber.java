
import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input the integer: ");
            double number = sc.nextDouble();
    
       if ( number == 0 ){
        System.out.println("Answer: neutral");
       }
       if ( number < 0 ){
        System.out.println("Answer: negative");
       }
       if ( number > 0 ){
        System.out.println("Answer: positive");
       }
        }
}
}
