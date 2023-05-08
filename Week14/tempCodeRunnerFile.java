import java.util.Locale;
import java.util.ResourceBundle;

public class L18NDemo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "FR"));
        greetTheUser();
    }

    static void greetTheUser(){
        ResourceBundle rb = ResourceBundle.getBundle("application");
        String message = rb.getString("message");
        String title = rb.getString("title");

        System.out.println(message);
        System.out.println(title);
    
    }
}
