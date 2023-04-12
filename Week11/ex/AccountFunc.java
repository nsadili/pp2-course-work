import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccountFunc {

    public static void main(String[] args) {
        List<Account> lst = new ArrayList<>();
        lst.add(new Account("Narmin", "Huseynova", 1500.00));
        lst.add(new Account("Laman", "Panakhova", 2500.00));
        lst.add(new Account("Rasul", "Panakhov", 3500.00));
        lst.add(new Account("Nazrin", "Panakhova", 4500.00));
        lst.add(new Account("Panah", "Huseynov", 5500.00));

        // Collections.sort(lst,
        // Comparator.comparingDouble(Double::Account.getBalance()));
        // how TODO sorting based on balance ???

        // lst.sort(new Comparator<Account>() {

        // @Override
        // public int compare(Account o1, Account o2) {
        // return o1.balance.compareTo(o2.balance);
        // };

        // });

        lst.sort((a1, a2) -> a1.balance.compareTo(a2.balance));
        System.out.println(lst);
        // if (a1.balance == a2.balance) {
        // how TODO IT ???
        // }
    }
}
