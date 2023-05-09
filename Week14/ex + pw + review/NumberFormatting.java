import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {
        
        var value = 5123.4567;

        NumberFormat formatter = new DecimalFormat("Your number just became 000,000.00");
        System.out.println(formatter.format(value));
        
   
    }
}
