import java.util.ResourceBundle;
import java.text.MessageFormat;
//import java.util.Locale;
public class pw4{

    public static void main(String[] args) {
        ResourceBundle rb= ResourceBundle.
       // getBundle("application", Locale.of("az", "AZ"));
        getBundle("application");

        System.out.println(MessageFormat.format(rb.getString("hello"), "Tom"));
       // System.out.println(rb.getString("hello"));
    }
}