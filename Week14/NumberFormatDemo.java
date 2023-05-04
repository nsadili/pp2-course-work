import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {

        var value = 512345466.6576;

        NumberFormat formatter = new DecimalFormat("Your number just became 000,000.##");
        System.out.println(formatter.format(value));
    }
}