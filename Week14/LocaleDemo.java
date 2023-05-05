import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();
        Locale enUkLocale = Locale.of("en", "UK");
        var testLocal = new Locale.Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();

        var value = 123.456;
        NumberFormat defFormatter = NumberFormat.getInstance();
        System.out.println(defFormatter.format(value));

        // Locale. CANADA_FRENCH
        NumberFormat frCAFormatter = NumberFormat. getInstance(Locale.of("fr", "CA")); System.out.println(frCAFormatter.format(value));
       
        var share = 0.0045;
        System.out.println(NumberFormat.getPercentInstance().format(share));
        System.out.println(NumberFormat.getPercentInstance(Locale.CANADA_FRENCH).format(share));

        System.out.println(defLocale);
        System.out.println(enUkLocale);
        Locale.setDefault(enUkLocale);
        System.out.println(Locale.getDefault());
        System.out.println(testLocal);

    }
}
