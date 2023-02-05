import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Average{
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers: ");
      String text = sc.nextLine();
      int sum = 0;
      int cnt = 0;
      String[] qutu = text.split(" ");

       for (String a: qutu) {
           sum += Integer.parseInt(a);
           cnt++;
       }

       System.out.println(sum/cnt);

    }
}


