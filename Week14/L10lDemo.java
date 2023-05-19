package Week14;

import java.util.Locale;
import java.util.ResourceBundle;

public class L10lDemo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "CA"));
        greedTheUser();


    }

    static void greedTheUser(){

        ResourceBundle rb = ResourceBundle.getBundle("application");

        String message = rb.getString("message");
        String title = rb.getString("title");

        System.out.println(message);
        System.out.println(title);


    }
}