import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class PrintingPatterns{
 public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int size = sc.nextInt();
    
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
}


