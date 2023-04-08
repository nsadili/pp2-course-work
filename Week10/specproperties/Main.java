package specproperties;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import generics.Account;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 3, 1);
        List<String> words = Arrays.asList("life", "isi", "going", "ono");
        List<Account> accounts = Arrays.asList(new Account("Rahima", "Karimova", 0.0));
        System.out.println(Utility.count(numbers, new EvenIntegerProperty()));
        System.out.println(Utility.count(words, new CheckPolindrom()));
        System.out.println(Utility.count(accounts, new EmptyAccountProperty()));

        System.out.println(Utility.filter(numbers, new EvenIntegerProperty()));
        System.out.println(Utility.filter(words, new CheckPolindrom()));

    }
}
