import java.util.Locale;

public class LocalizationDemo {
    public static void main(String[] args) {
        
        Locale defLocale = Locale.getDefault();

        Locale frLocale = Locale.of("fr");
        Locale frFranceLocale = Locale.of("fr", "FR");

        System.out.println(defLocale);
        System.out.println(frFranceLocale);
        System.out.println(frLocale);

        Locale.setDefault(frFranceLocale);
        System.out.println(Locale.getDefault());
    }
}
