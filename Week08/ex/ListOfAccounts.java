package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfAccounts {
    public static void main(String[] args) {
        ArrayList<Account> accs = new ArrayList<>(
                List.of(
                        new Account("Rahima", "Karimova", 100),
                        new Account("Amina", "Aliyeva", 120),
                        new Account("Nazrin", "Cafarova", 80),
                        new Account("Radmila", "Hajiyeva", 120)));

        Collections.sort(accs);
        Collections.sort(accs,new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {
                
                return o2.getBalance().compareTo(o1.getBalance());
            }
            
        });
        ;
        printList(accs);

    }

    static void printList(List<Account> accs) {
        for (Account acc : accs)
            System.out.println(acc);
    }

}
