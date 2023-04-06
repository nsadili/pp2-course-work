package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import generics.*;;

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

    static <T> ArrayList<?> countSpecific(ArrayList<T> arr) {
        if (arr.size() == 0)
            throw new IllegalArgumentException();
        ArrayList<T> res = new ArrayList<>();
        if (arr.get(0) instanceof Integer) {
            for (T el : arr) {
                int num = ((Number) el).intValue();
                if (num % 2 == 0)
                    res.add(el);
            }
        } else if (arr.get(0) instanceof String) {
            for (T str : arr) {
                if (palindrome((String) str)) {
                    res.add(str);
                }
                // System.out.println(str);
            }
        } else if (arr.get(0) instanceof Account) {
            for (T acc : arr) {
                if (((Account) acc).getBalance() == 0)
                    res.add(acc);
            }
        } else
            throw new IllegalArgumentException("No valid type of collection is provided.");
        return res;
    }

    static <T> boolean palindrome(String str) {
        char[] strChar = ((String) str).replaceAll("\\s+", "").toCharArray();
        int cnt = 0, i = 0, j = strChar.length - 1;

        while (i < j) {
            // System.out.println(strChar[i]+" "+strChar[j]);
            if (strChar[i] == strChar[j]) {
                cnt++;
                // System.out.println(cnt);
                if (cnt == strChar.length / 2)
                    return true;
            } else
                break;
            i++;
            j--;
        }
        return false;
    }
}
