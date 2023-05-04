import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        var value = 123.4567;
        
        NumberFormat f1 = new DecimalFormat("###,000.0$");

        System.out.println(f1.format(value));
    }
}
