import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<ListsInAccount> accounts = new ArrayList<>();
        accounts.add(new ListsInAccount("Ali", "Aliyev", 300.5));
        accounts.add(new ListsInAccount("Ali", "Eyvazov", 345.2));
        accounts.add(new ListsInAccount("Zakir", "Gurbanov", 0));
        accounts.add(new ListsInAccount("Nabi", "Safiyev", 20.2));

        System.out.println("Accounts before sorting:");
        for (ListsInAccount account : accounts) {
            System.out.println(account.toString());
        }

        Collections.sort(accounts);
        System.out.println("\nSorting based on fullname:");
        for (ListsInAccount account: accounts) {
            System.out.println(account.toString());
        }

        Collections.sort(accounts, new BalanceComparator());
        System.out.println("\nSorting based on both fullname and balance:");
        for (ListsInAccount account: accounts) {
            System.out.println(account.toString());
        }
    }
}

class ListsInAccount implements Comparable<ListsInAccount> {
    private String firstname;
    private String lastname;
    private double balance;

    public ListsInAccount(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return this.balance;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

  
    public int compareTo(@NotNull ListsInAccount o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}

class BalanceComparator implements Comparator<ListsInAccount> {
  
    public int compare(ListsInAccount o1, ListsInAccount o2) {
        return Double.compare(o1.getBalance(), o2.getBalance());
    }
}
