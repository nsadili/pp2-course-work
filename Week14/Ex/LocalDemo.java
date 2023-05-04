package Ex;

import java.util.Locale;

public class LocalDemo {

    public static void main(String[] args) {

        Locale defLoc = Locale.getDefault();

        System.out.println(defLoc);

        Locale fr = new Locale("fr", "Ca");

        Locale ge = Locale.GERMANY;

        // System.out.println(defLoc);

        // System.out.println(fr);

        // System.out.println(ge);

        // Locale.setDefault(ge);

        System.out.println(Locale.getDefault());

        var newLocale = new Locale.Builder()

                .setLanguage("tr")
                .setRegion("TR")
                .build();

        System.out.println(newLocale);

        

    }
}
