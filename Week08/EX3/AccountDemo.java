package EX3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountDemo {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>(
            List.of(
                new Account("Leyla", "Neymat", 125),
                new Account("Elvin", "Hayatov", 13423),
                new Account("Aysel", "Aslanova", 3242443)
            )
        );

        Collections.sort(accountList, new Comparator<Account>(){
           @Override
           public int compare(Account o1, Account o2) {
               return o1.compareTo(o2);
           }
        });

        for (Account c: accountList){
            System.out.println(c);
        }
    }
}
