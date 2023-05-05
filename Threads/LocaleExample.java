package Threads;

import java.util.*;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale);


        Locale enLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");
        Locale esLocale = new Locale("es", "ES");
        System.out.println("English language name (default): " +
                enLocale.getDisplayLanguage());

        System.out.println("English language name in French: " +
                enLocale.getDisplayLanguage(frLocale));
        System.out.println("English language name in spanish: " +
                enLocale.getDisplayLanguage(esLocale));
    }


}
