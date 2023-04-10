package ElementCounter;

import java.util.ArrayList;
import java.util.Collection;

public class SpecificElementCount {

    public static <T> int countElements(Collection<T> collection, Checker<T> checker) {
        int count = 0;
        for (T item : collection) {
            if (checker.check(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);

        int evenCount = countElements(intList, new Checker<Integer>() {
            @Override
            public boolean check(Integer item) {
                return item % 2 == 0;
            }
        });

        System.out.println("Num of even integers count in the integer array: " + evenCount);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("level");
        strList.add("racecar");
        strList.add("palindrome");
        strList.add("java");

        int palindromeCount = countElements(strList, new Checker<String>() {
            @Override
            public boolean check(String item) {
                return item.equals(new StringBuilder(item).reverse().toString());
            }
        });

        System.out.println("Num of palindrome strings count in the string array: " + palindromeCount);

        ArrayList<Account> accList = new ArrayList<>();
        accList.add(new Account(1001, "John", 0));
        accList.add(new Account(1002, "Connor", 50));
        accList.add(new Account(1003, "Kara", 0));
        accList.add(new Account(1004, "Emma", 100));

        int emptyCount = countElements(accList, new Checker<Account>() {
            @Override
            public boolean check(Account item) {
                return item.getBalance() == 0;
            }
        });

        System.out.println("Num of empty accounts in the account array: " + emptyCount);
    }

    public interface Checker<T> {
        boolean check(T item);
    }
}