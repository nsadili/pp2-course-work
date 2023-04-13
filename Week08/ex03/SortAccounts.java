package Week08.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAccounts {
    static List<Account> accounts = new ArrayList<>();
    

    public static void main(String[] args) {
        accounts.add(new Account("Sadiq", "Mammadov", 5000.0));
        accounts.add(new Account("Ali", "Aliyev", 2500.0));

        for (Account account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return (o1.getFirstName() + o1.getLastName())
                        .compareTo(o2.getFirstName() + o2.getLastName());
            }
        });

        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getBalance(), o2.getBalance());
            }
        });
        
        Collections.sort(accounts);
    }
}
