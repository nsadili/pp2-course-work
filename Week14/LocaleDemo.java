import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();
        Locale enUkLocale = Locale.of("en", "UK");
        var testLocal = new Locale.Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();
                
        System.out.println(defLocale);
        System.out.println(enUkLocale);
        Locale.setDefault(enUkLocale);
        System.out.println(Locale.getDefault());
        System.out.println(testLocal);

    }
}
