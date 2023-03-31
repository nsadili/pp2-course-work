import listofaccounts.Account;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ListOfAccounts {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<Account>();
        Account acc1 = new Account("John", "Doe", 1000);
        Account acc2 = new Account("Jane", "Smith", 5000);
        Account acc3 = new Account("Bob", "Johnson", 2500);
        Account acc4 = new Account("Samantha", "Lee", 4000);
        Account acc5 = new Account("Michael", "Brown", 3000);
        Account acc6 = new Account("Emily", "Davis", 2000);
        Account acc7 = new Account("David", "Nguyen", 3500);
        Account acc8 = new Account("Rachel", "Kim", 6000);
        Account acc9 = new Account("Alex", "Chen", 1500);
        Account acc10 = new Account("Lily", "Wang", 4500);
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);
        accounts.add(acc6);
        accounts.add(acc7);
        accounts.add(acc8);
        accounts.add(acc9);
        accounts.add(acc10);

        
        System.out.println(accounts.toString());

        Collections.sort(accounts, Account.CompareBalance);
        System.out.println(accounts.toString());

        Collections.sort(accounts, Account.CompareFullName);
        System.out.println(accounts.toString());
    }
}
