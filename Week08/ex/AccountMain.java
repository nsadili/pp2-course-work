import Account.Account;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountMain{

    public static void main(String[] args) {
        Account a1 = new Account("Rufat", "Hajizada", 3000);
        Account a2 = new Account("Shamil", "Abbasov", 200);
        Account a3 = new Account("Arzum", "Abdullazada", 1400);
        Account a4 = new Account("Nariman", "Mammadov", 1500);
        
        ArrayList<Account> accs = new ArrayList<>();
        Collections.addAll(accs, a1, a2, a3, a4);
        printAcc(accs);
        Collections.sort(accs);
        printAcc(accs);

        Collections.sort(accs, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.getBalance().compareTo(o1.getBalance());
            } 
        });
        printAcc(accs);



    }

    static void printAcc(List<Account> accs){
        for (Account acc : accs)
        System.out.print(acc);
        System.out.println();
    }
}



