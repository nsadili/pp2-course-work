import java.util.ArrayList;
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

    }
}
