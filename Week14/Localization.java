import java.text.NumberFormat;
import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();

        // Locale fr = new Locale("fr");
        // Locale ge = Locale.GERMANY;
        // System.out.println(fr);
        // System.out.println(ge);
        System.out.println(defLocale);

        // Locale.setDefault(ge);
        // System.out.println(Locale.getDefault());

        // var newLocale = new Locale.Builder()
        // .setLanguage("tr")
        // .setRegion("TR")
        // .build();

        // System.out.println(newLocale);

        var value = 123.456;

        NumberFormat defFormatter = NumberFormat.getInstance();
        System.out.println(defFormatter.format(value));

        NumberFormat frCAFormatter = NumberFormat.getInstance(new Locale("fr"));
        System.out.println(frCAFormatter.format(value));

        var share = 0.045;

        System.out.println(NumberFormat.getPercentInstance().format(share));
        System.out.println(NumberFormat.getPercentInstance(Locale.CANADA_FRENCH).format(share));

        var amount = 512.1024;

        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(amount));

        
    }
}
