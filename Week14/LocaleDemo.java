import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        var value =123.456;
        NumberFormat defFormatter = NumberFormat.getInstance();
        System.out.println(defFormatter.format(value));

        NumberFormat frCAFormatter = NumberFormat.getInstance(new Locale("fr", "CA"));
        System.out.println(frCAFormatter.format(value));

        // System.out.println(NumberFormat.getInstance());

        // var share = 0.046;
        // System.out.println(NumberFormat.getPercentInstance().format(share));
        // System.out.println(NumberFormat.getPercentInstance(Locale.CANADA_FRENCH).format(share));

        var amount = 512.1024;
        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(amount));
    }
}
