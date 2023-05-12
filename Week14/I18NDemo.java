package Week14;

import java.util.ResourceBundle;

public class I18NDemo {
    public static void main(String[] args) {
        greetTheUser();
    }
    static void greetTheUser(){
        ResourceBundle rb = ResourceBundle.getBundle("Week14/bundles/application");
        String message = rb.getString("message");
        String title = rb.getString("title");
        System.out.println (message);
        System.out.println(title);
    }
}
