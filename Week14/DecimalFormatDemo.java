package Week14;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        String pattern = "000,000.0";
        double value = 50123.4567;
        NumberFormat f1 = new DecimalFormat(pattern);

        System.out.println(f1.format(value));
    }
}
