package Moderate;
import java.util.Random;

public class RollingDie {
  public static void main(String[] args) {
    Random random = new Random();
    int result = random.nextInt(8);
    
    if (result < 4) {
      System.out.println(result + 1);
    } else {
      System.out.println(random.nextInt(2) + 5);
    }
  }
}
