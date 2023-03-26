package AccountLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfAccounts {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Keanu", "Reeves", 10000.0));
        accounts.add(new Account("Will", "Smith", 50000.0));
        accounts.add(new Account("Bob", "Odenkirk", 200000.0));
        accounts.add(new Account("Tom", "Hardy", 150000.0));

        System.out.println("List of accounts:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        Collections.sort(accounts);

        System.out.println("\nSorted list of accounts:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return Double.compare(account1.getBalance(), account2.getBalance());
            }
        };

        Collections.sort(accounts, balanceComparator);

        for (Account account : accounts) {
            System.out.println(account.toString());
        }

    }

}
