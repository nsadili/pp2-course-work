import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number: ");
      var n = scan.nextInt();

      var sum = 0.0;

      for(int i = 1; i<=n; i++){
        sum += 1.0 / i;
      }
      
      System.out.println(sum);
    }
}