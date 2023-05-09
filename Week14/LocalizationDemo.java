import java.text.NumberFormat;
import java.util.Locale;

public class LocalizationDemo {
    public static void main(String[] args) {
        double value = 125342.12;
        Locale defLocale =Locale.getDefault();
        Locale frLocalee= new Locale("fr");
        System.out.println(defLocale);
        System.out.println(frLocalee);
        NumberFormat frCaFormatter = NumberFormat.getInstance(new Locale("fr", "CA"));
        System.out.println(frCaFormatter.format(value));
        var amount = 13243.235;
        System.out.println(NumberFormat.getCurrencyInstance().format(amount));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(amount));
    }
}
