package Week14;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {

        var value = 123.456;

        NumberFormat defFormatter = NumberFormat.getInstance();
        System.out.println(defFormatter.format(value));

        Locale frLocale = new Locale("fr", "CA");
        NumberFormat frCAFormatter = NumberFormat.getInstance(frLocale);
        System.out.println(frCAFormatter.format(value));

        var share = 0.045;

        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        System.out.println(percentFormatter.format(share));
    }
}
