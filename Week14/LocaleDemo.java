import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale defLoc = Locale.getDefault();
        Locale fr = Locale.of("fr");
        Locale ge = Locale.GERMANY;

        System.out.println(defLoc);
        System.out.println(fr);
        System.out.println(ge);
        Locale.setDefault(ge);
        System.out.println(Locale.getDefault());
        var newLocale = new Locale.Builder()
                .setLanguage("tr")
                .setRegion("TR")
                .build();
        System.out.println(newLocale);
    }
}
