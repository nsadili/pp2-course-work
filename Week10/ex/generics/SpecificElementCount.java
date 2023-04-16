package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpecificElementCount {
    public static void main(String[] args) {
        List<Integer> lstInt = new ArrayList<>();
        lstInt.add(2);
        lstInt.add(28);
        lstInt.add(38);
        lstInt.add(99);
        lstInt.add(88);
        lstInt.add(24);
        lstInt.add(75);
        lstInt.add(13);

        System.out.println(countEvenNumbers(lstInt));
        List<String> lstStr = new ArrayList<>();

        lstStr.add("civic");
        lstStr.add("civil");
        lstStr.add("madam");
        lstStr.add("madan");
        lstStr.add("radar");
        lstStr.add("radak");

        String str = Arrays.toString(lstStr.toArray());

        palindromeStrings(str);

        List<Account> lstAcc = new ArrayList<>();
        lstAcc.add(null);
        lstAcc.add(null);
        lstAcc.add(null);
        lstAcc.add(null);

    }

    static int countEvenNumbers(List lst) {
        int cnt = 0;
        System.out.println("The elements are: ");
        for (var el : lst.toArray()) {

            if ((int) el % 2 == 0) {
                System.out.print(el + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.print("The number of even elements: ");
        return cnt;
    }

    static void palindromeStrings(String string) {

        //String obj = string.toString();
        String original = string;
        String reverse = "";

        for(int i = string.length(); i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean palindrome = true;
        for(int i = 0; i < string.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }
    }

    static List emptyAccounts(List lst) {

        return null;
    }
}