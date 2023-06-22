import java.util.Scanner;

public class MinMax {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      
      double min = Double.MAX_VALUE;
      double max = Double.MIN_VALUE;
      
      while (obj.hasNextDouble()) {
         double value = obj.nextDouble();

         if (value > max) {
            max = value;
         }

         if (value < min) {
            min = value;
         }
         
      }

      System.out.println("Max: " + max);
      System.out.println("Min: " + min);
   }
}
