import java.text.NumberFormat;
import java.util.Locale;

public class LocalDemo1 {
    public static void main(String[] args) {
        var value = 123.456;

        NumberFormat formatter1 = NumberFormat.getInstance();
        System.out.println(formatter1.format(value));

        NumberFormat formatter2 = NumberFormat.getInstance(new Locale("fr", "CA"));
        System.out.println(formatter2.format(value));

        var share = 0.045;

        System.out.println(NumberFormat.getPercentInstance().format(share));
        System.out.println(NumberFormat.getPercentInstance(Locale.CANADA_FRENCH).format(share));
        
        var amount = 12343.045;

        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(amount));



    }
}
