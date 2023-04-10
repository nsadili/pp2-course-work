package generics.specproperties;

import java.util.Arrays;
import java.util.List;

import generics.Account;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 5, 6, 8, 3, 7, 9);

        System.out.println(Utility.count(numbers, new EvenIntegerProperty()));
        System.out.println(Utility.count(numbers, new OddIntegerProperty()));
        System.out.println(Utility.filter(numbers, new EvenIntegerProperty()));

        List<String> strings = Arrays.asList("Laman", "Rasul", "Nazrin", "madam", "boob");
        System.out.println(Utility.count(strings, new PalindromeProperty()));

        List<Account> accounts = Arrays.asList(new Account("Laman", "Panakhova", 1500.00),
                new Account("Rasul", "Panakhov", 0.00),
                new Account("Nazrin", "Panakhova", 0.00));
        System.out.println(Utility.count(accounts, new EmptyAccountProperty()));
    }
}
