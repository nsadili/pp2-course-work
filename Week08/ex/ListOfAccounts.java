package Week08.ex;
import java.util.*;

class Account implements Comparable<Account> {
    private String firstName, lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("{ %s, %s: %f }", lastName, firstName, balance);
    }

    @Override
    public int compareTo(Account acc) {
        if (this.lastName.compareTo(acc.getLastName()) != 0)
            return this.lastName.compareTo(acc.getLastName());
        return this.firstName.compareTo(acc.getFirstName());
    }
}

public class ListOfAccounts {
    public static void main(String[] args) {
        List<Account> accs1 = new ArrayList<Account>(
            List.of(
                new Account("Zaur", "Rajabov", 300e9),
                new Account("Vasya", "Pupkin", 2.01),
                new Account("Jack", "Smith", 866675.3)
            )
        );

        System.out.println(accs1);

        List<Account> accs2 = new ArrayList<Account>(accs1);
        accs2.add(new Account("Jack", "Smith", 902.0925));
        
        List<Account> accs3 = new ArrayList<Account>(accs1);

        Collections.sort(accs2);

        System.out.println(accs2);

        accs3.sort(new Comparator<Account>() {
            @Override
            public int compare(Account acc1, Account acc2) {
                return acc1.getBalance() < acc2.getBalance() ? 1 : -1;
            }
        });

        System.out.println(accs3);
    }
}
