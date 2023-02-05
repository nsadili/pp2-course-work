import java.util.Scanner;

public class PolarityOfNumber {
   public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        float n = scan.nextInt();
        if (n < 0){
            System.out.println("negative");
        }
        else if (n > 0){
            System.out.println("positive");
        }
        else{
            System.out.println("neutral");
        }

      
   } 
}
}
