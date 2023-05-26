import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountDemo {
    public static void main(String[] args) {
        List<Account> accs = new ArrayList<>(
                List.of(new Account("Ali", "Aliyev", 100),
                        new Account("Aliya", "Hasanova", 200),
                        new Account("Nuraddin", "Sadili", 50),
                        new Account("Zaur", "Aghayev", 70),
                        new Account("Ali", "Amirov", 70)));

        // System.out.println(accs);

        Collections.sort(accs);

        Collections.sort(accs, new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {
                return o2.getBalance().compareTo(o1.getBalance());
            }

        });
        printList(accs);
    }

    static void printList(List<Account> accs) {
        for (Account acc : accs)
            System.out.println(acc);
    }
}