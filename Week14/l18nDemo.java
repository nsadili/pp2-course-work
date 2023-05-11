import java.util.Locale;
import java.util.ResourceBundle;

public class l18nDemo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr"));
        // Locale.setDefault(new Locale("fr", "CA"));
        // Locale.setDefault(new Locale("fr", "FR"));

        System.out.println();
    }

    static void greetUser() {
        ResourceBundle rb = ResourceBundle.getBundle("application");
        String message = rb.getString("message");
        String title = rb.getString("title");
        System.out.println(message);
        System.out.println(title);

    }
}
