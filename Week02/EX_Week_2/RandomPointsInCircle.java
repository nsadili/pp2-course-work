import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class RandomPointsInCircle{
 public static void main(String[] args) {
  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n= sc.nextInt();
    double coor = Math.random();
    

   for(int i=0; i<n; i++){
    System.out.printf("(%.1f, %.1f)%n", Math.random(), Math.random());

   }

}
}


