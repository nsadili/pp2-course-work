import java.util.ArrayList;
import java.util.Collection;

public class ElementCounter {

    public static void main(String[] args) {

        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);
        integerCollection.add(5);
        integerCollection.add(6);
        integerCollection.add(7);
        integerCollection.add(8);
        integerCollection.add(9);
        integerCollection.add(10);
        int evenIntegerCount = count(integerCollection, new EvenNumberPredicate());
        System.out.println("Number of even integers in the collection: " + evenIntegerCount);

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("racecar");
        stringCollection.add("hello");
        stringCollection.add("level");
        stringCollection.add("world");
        stringCollection.add("deified");
        stringCollection.add("java");
        int palindromeCount = count(stringCollection, new PalindromeStringPredicate());
        System.out.println("Number of palindrome strings in the collection: " + palindromeCount);

        Collection<Account> accountCollection = new ArrayList<>();
        accountCollection.add(new Account(1, 0));
        accountCollection.add(new Account(2, 400));
        accountCollection.add(new Account(3, 0));
        accountCollection.add(new Account(4, 1500));
        int emptyAccountCount = count(accountCollection, new EmptyAccountPredicate());
        System.out.println("Number of empty accounts in the collection: " + emptyAccountCount);
    }

    public static <T> int count(Collection<T> collection, ElementPredicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }
}

interface ElementPredicate<T> {
    boolean test(T element);
}

class EvenNumberPredicate implements ElementPredicate<Integer> {
    @Override
    public boolean test(Integer element) {
        return element % 2 == 0;
    }
}

class PalindromeStringPredicate implements ElementPredicate<String> {
    @Override
    public boolean test(String element) {
        String reversed = new StringBuilder(element).reverse().toString();
        return element.equals(reversed);
    }
}

class EmptyAccountPredicate implements ElementPredicate<Account> {
    @Override
    public boolean test(Account element) {
        return element.getBalance() == 0;
    }
}

class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}