package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import Week10.generics.*;;

public class SpecificElementCount {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(countSpecific(arr));

        ArrayList<String> arr2 = new ArrayList<>(
                Arrays.asList("rufat", "noon", "calculus", "my gym", "repaper", "madam"));
        System.out.println(countSpecific(arr2));

        ArrayList<Account> arr3 = new ArrayList<>();
        arr3.add(new Account("Shamil", "Abbasov", 1600.0));
        arr3.add(new Account("Arzum", "Abdullazada", 300.0));
        arr3.add(new Account("Muhammad", "Mammadzada", 0.0));
        System.out.println(countSpecific(arr3));

        // ArrayList<Double> arr4 = new ArrayList<>(Arrays.asList(1.9, 2.2, 3.1, 4.6, 5.3, 6.7, 7.9));
        // System.out.println(countSpecific(arr4));
    }

    static <T> Collection<?> countSpecific(Collection<T> arr) {
        if (arr.size() == 0)
            throw new IllegalArgumentException();
        ArrayList<T> res = new ArrayList<>();
        if (arr.iterator().next() instanceof Integer) {
            for (T el : arr) {
                int num = ((Number) el).intValue();
                if (num % 2 == 0)
                    res.add(el);
            }
        } else if (arr.iterator().next() instanceof String) {
            for (T str : arr) {
                if (palindrome((String) str)) {
                    res.add(str);
                }
                // System.out.println(str);
            }
        } else if (arr.iterator().next() instanceof Account) {
            for (T acc : arr) {
                if (((Account) acc).getBalance() == 0)
                    res.add(acc);
            }
        } else
            throw new IllegalArgumentException("No valid type of collection is provided.");
        return res;
    }

    static <T> boolean palindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
