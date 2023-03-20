import java.util.*;
public class AccountsDemo {
    public static void main(String[] args) {
        List <Account> accs = new ArrayList<>(List.of(
            new Account("Ali", "Aliyev", 100), 
            new Account("Aliya", "Hasanova", 200), 
            new Account("Nuraddin", "Sadili", 50), 
            new Account("Ali", "Amirov", 100), 
            new Account("Zaur", "Aghayev", 70)));
        //System.out.println(accs);
        Collections.sort(accs);
        Collections.sort(accs, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.getBalance().compareTo(o1.getBalance());
            
            }
        });
        PrintList(accs);
    }
    static void PrintList(List<Account> accs) {
        for(Account acc : accs) System.out.println(acc);
    }
}
