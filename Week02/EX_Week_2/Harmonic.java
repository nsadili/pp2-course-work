import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Harmonic{
    public static void main(String[] args) throws Exception {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number: ");
      var n = sc.nextInt();

      var sum = 0.0;

      for(int i = 1; i<=n; i++){
        sum += 1.0 / i;
      }
      
      System.out.println(sum);
    }
}


