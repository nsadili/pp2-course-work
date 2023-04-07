package Week10.SpecificProperty;

import java.util.ArrayList;
import java.util.Arrays;

import Week10.generics.Account;

public class PropMain {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(PropCounter.count(arr, new IntegerProperty()));

        ArrayList<String> arr2 = new ArrayList<>(
                Arrays.asList("rufat", "noon", "calculus", "my gym", "repaper", "madam"));
        System.out.println(PropCounter.count(arr2, new StringProperty()));

        ArrayList<Account> arr3 = new ArrayList<>();
        arr3.add(new Account("Shamil", "Abbasov", 1600.0));
        arr3.add(new Account("Arzum", "Abdullazada", 300.0));
        arr3.add(new Account("Muhammad", "Mammadzada", 0.0));
        System.out.println(PropCounter.count(arr3, new AccountProperty()));
    }
}
