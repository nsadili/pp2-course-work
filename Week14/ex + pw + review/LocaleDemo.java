import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        var value = 123.456;
        int a, b;
        a = b = 10;

        NumberFormat defFormatter = NumberFormat.getInstance();
        System.out.println(defFormatter.format(value));

        // NumberFormat frCAformatter = NumberFormat.getInstance(Locale.CANADA_FRENCH);

        NumberFormat frCAformatter = NumberFormat.getInstance(Locale.of("fr", "CA"));

        System.out.println(frCAformatter.format(value));


        var share = 0.0045;

        System.out.println(NumberFormat.getPercentInstance().format(share));
        System.out.println(NumberFormat.getPercentInstance(Locale.CANADA_FRENCH).format(share));

        var amount = 512.1024;

        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(amount));

    }
}
