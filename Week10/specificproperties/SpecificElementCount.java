package week10.specificproperties;

import java.util.Collection;
import java.util.List;

public class SpecificElementCount {

    public static <T> int count(Collection<T> collection, ElementProperty<T> property) {
        int cnt = 0;
        for (T element : collection) {
            if (property.hasProperty(element)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Collection<Integer> integers = List.of(1, 2, 3, 4);
        int evenCount = count(integers, new ElementProperty<Integer>() {
            public boolean hasProperty(Integer element) {
                return element % 2 == 0;
            }
        });
        System.out.println("Number of even int: " + evenCount);


        Collection<String> strings = List.of("one", "two", "three", "four");
        int palindromeCount = count(strings, new ElementProperty<String>() {

            public boolean hasProperty(String element) {
                String reversed = new StringBuilder(element).reverse().toString();
                return element.equals(reversed);
            }
        });
        System.out.println("Number of palindrome str: " + palindromeCount);

        // Example test for empty accounts
        Collection<Account> accounts = List.of(
                new Account("Ulkar", 100),
                new Account("Nijat", 0),
                new Account("Rovshan", 500),
                new Account("Tural", 0)
        );
        int emptyAccountCount = count(accounts, new ElementProperty<Account>() {

            public boolean hasProperty(Account element) {
                return element.getBalance() == 0;
            }
        });
        System.out.println("Number of empty acc: " + emptyAccountCount);
    }
}

interface ElementProperty<T> {
    boolean hasProperty(T element);
}

class Account {
    private final String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
