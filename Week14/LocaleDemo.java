package Week14;

import java.text.DecimalFormat;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale defLocale = Locale.getDefault();
        System.out.println(defLocale);  
        Locale currentLocale = Locale.getDefault();
        DecimalFormat customFormat = (DecimalFormat) DecimalFormat.getInstance(currentLocale);

        double number = 1234567.89;
        String formatted = customFormat.format(number);
        System.out.println(formatted);
    }
}
