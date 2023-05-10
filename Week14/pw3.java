import java.text.NumberFormat;
import java.text.ParseException;

public class pw3 {
    public static void main(String[] args) {
        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value = (Double) cf.parse(income);
        try {
            value=(Double)cf.parse(income);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(value); // 92807.99
    }
}
