package exercise4;

import java.util.Collection;
import java.util.List;

public class ElementCounter {
    
    // Generic method that takes in a collection and a property checker to count elements
    public static <T> int countElementsWithProperty(Collection<T> collection, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.check(element)) {
                count++;
            }
        }
        return count;
    }
    
    // Functional interface to check properties of elements
    public interface PropertyChecker<T> {
        boolean check(T element);
    }
    
    public static void main(String[] args) {
        // Count even integers in a collection
        Collection<Integer> intCollection = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = countElementsWithProperty(intCollection, element -> element % 2 == 0);
        System.out.println("Even integers in the collection: " + evenCount);

        // Count palindrome strings in a collection
        Collection<String> stringCollection = List.of("racecar", "hello", "level", "world", "deified", "java");
        int palindromeCount = countElementsWithProperty(stringCollection, element -> {
            String reversed = new StringBuilder(element).reverse().toString();
            return element.equals(reversed);
        });
        System.out.println("Palindrome strings in the collection: " + palindromeCount);

        // Count empty accounts in a collection
        Collection<Account> accountCollection = List.of(
                new Account("John", 500),
                new Account("Alice", 0),
                new Account("Bob", -100),
                new Account("Jane", 0),
                new Account("Charlie", 1000),
                new Account("Eve", 0)
        );
        int emptyCount = countElementsWithProperty(accountCollection, Account::isBalanceZero);
        System.out.println("Empty accounts in the collection: " + emptyCount);
    }

    // Inner class representing a bank account
    public static class Account {
        private String owner;
        private int balance;

        public Account(String owner, int balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        // Method to check if an account has a zero balance
        public boolean isBalanceZero() {
            return balance == 0;
        }
    }
}
