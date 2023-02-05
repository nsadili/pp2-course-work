import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class RollingDie{
    public static void main(String[] args) throws Exception {
      
      Random rand = new Random();
      int roll = rand.nextInt(8);

      if (roll < 4) {
          System.out.println(roll + 1);
      } 
      else{
          System.out.println(rand.nextInt(2) + 5);
      }
}
}


