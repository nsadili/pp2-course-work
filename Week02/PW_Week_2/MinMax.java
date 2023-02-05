import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class MinMax{
 public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter the numbers: ");
      String text = sc.nextLine();
      int min;
      int max;
      int temp;
      String[] qutu = text.split(" ");
      min = Integer.parseInt(qutu[0]);
      max = Integer.parseInt(qutu[0]);

       for (String a: qutu) {
            temp = Integer.parseInt(a);
           if(min > temp ){
              min = temp;
           }
           if(max < temp){
              max = temp;
           }
           
       }

       System.out.println("Min: "+min +"   Max: "+max);

}
}


