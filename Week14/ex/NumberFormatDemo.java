import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatDemo{
    public static void main(String[] args) {

        var value = 134.4567;
        NumberFormat formatter = new DecimalFormat("Here is the money: $ 000,000.00");

        System.out.println(formatter.format(value));


    }
}