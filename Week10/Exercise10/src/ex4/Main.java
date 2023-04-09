package ex4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> intList = new LinkedList<>();
        intList.add(5); intList.add(2); intList.add(3); intList.add(11); intList.add(8);
        System.out.println("Even integers: " + elementCount(intList));

        Collection<String> strList = new LinkedList<>();
        strList.add("12321"); strList.add("hello"); strList.add("cool"); strList.add("repaper");
        System.out.println("Palindrome strings: " + elementCount(strList));

        Collection<Account> accList = new LinkedList<>();
        accList.add(new Account("Ali", 100)); accList.add(new Account("JJ", 0));
        accList.add(new Account("Bob", 0)); accList.add(new Account("Dio", 0));
        System.out.println("Zero-balance accounts: " + elementCount(accList));
    }

    public static <T> int elementCount(Collection<T> collection) {
        int cnt = 0;
        Iterator<T> it = collection.iterator();
        T firstEl = it.next();

        // even integers
        if (firstEl instanceof Integer) {
            if ((Integer)firstEl % 2 != 0)
                cnt++;
            for (int i = 1; i < collection.size(); i++) {
                if ((Integer)it.next() % 2 != 0)
                    cnt++;
            }
        }

        // palindrome strings
        if (firstEl instanceof String) {
            if (reverseString((String)firstEl).equals(firstEl))
                cnt++;

            for (int i = 1; i < collection.size(); i++) {
                String currStr = (String)it.next();
                if (reverseString((String)currStr).equals(currStr))
                    cnt++;
            }
        }

        // zero balance accounts
        if (firstEl instanceof Account) {
            if (((Account)firstEl).getBalance() == 0)
                cnt++;
            for (int i = 1; i < collection.size(); i++) {
                if (((Account)it.next()).getBalance() == 0)
                    cnt++;
            }
        }

        return cnt;
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }

        return reversed;
    }
}
