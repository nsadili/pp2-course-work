import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account implements Comparable<Account> {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Account other) {
        return (this.firstname + this.lastname).compareTo(other.firstname + other.lastname);
    }

    @Override
    public String toString() {
        return "[" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                ']';
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Ali", "Aliyev", 1000));
        accounts.add(new Account("Lionel", "Messi", 500));
        accounts.add(new Account("Cristiano", "Ronaldo", 2000));
        accounts.add(new Account("Mohammed", "Salah", 1500));

        for (Account account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);
        for (Account account : accounts) {
            System.out.println(account);
        }

        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                if (account1.getBalance() < account2.getBalance()) {
                    return -1;
                } else if (account1.getBalance() > account2.getBalance()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(accounts, balanceComparator);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

