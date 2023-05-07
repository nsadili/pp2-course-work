import java.util.Locale;

public class LocaleDemo{
    public static void main(String[] args) {
        
       Locale defLoc = Locale.getDefault();

       
       Locale ge = Locale.GERMANY;
       Locale fr = new Locale("fr", "FR");

       Locale.setDefault(ge);

       var newLocale = new Locale.Builder()
       .setLanguage("tr")
       .setRegion("TR")
       .build();

       //System.out.println(defLoc);
       //System.out.println(ge);
       //System.out.println(fr);
       //System.out.println(Locale.getDefault());
       System.out.println(newLocale);

    }
}