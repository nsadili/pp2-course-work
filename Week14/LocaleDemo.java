import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();

        // Locale  enUkLocale = Locale.of("en", "UK");
        Locale  enUkLocale = new Locale("en", "UK");

        System.out.println(Locale.getDefault());

        Locale.setDefault(enUkLocale);
        System.out.println(Locale.getDefault());


        // var testLocal = new Locale.Builder().
    }
}
