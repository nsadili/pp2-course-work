import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();

        Locale fr = new Locale("fr");
        Locale ge = Locale.GERMANY;
        // System.out.println(fr);
        // System.out.println(ge);
        // System.out.println(defLocale);

        Locale.setDefault(ge);
        System.out.println(Locale.getDefault());


       var newLocale = new Locale.Builder()
       .setLanguage("tr")
       .setRegion("TR")
       .build();

       System.out.println(newLocale);
    }
}
