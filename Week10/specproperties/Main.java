package specproperties;

import java.util.Arrays;
import java.util.List;

import generics.Account;

public class Main {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> words= Arrays.asList("racecar", "level","AL","aa");
        List<Account> accounts= Arrays.asList(new Account("null", "wds", 20.0),new Account("null", "wds", 2.0),new Account("null", "wds", 0.0));


        System.out.println(Utility.count(number, new EvenIntegerProperty()));
        System.out.println(Utility.count(words, new PalindromeProperty()));
        System.out.println(Utility.count(accounts, new EmptyBalance()));

        System.out.println(Utility.filter(number,new EvenIntegerProperty()));
        System.out.println(Utility.filter(words,new  PalindromeProperty()));


        

    }
}
