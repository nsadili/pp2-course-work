import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;



public class I18NDemo {
    private static ResourceBundle rb;
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr"));
        Scanner sc = new Scanner(System.in);
        System.out.println(rb.getString("prompt"));
        var name = sc.nextLine();

        sc.close();

        






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
