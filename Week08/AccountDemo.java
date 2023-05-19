package Week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class AccountDemo {
public static void main(String[] args) {
List<Account> accs = new ArrayList<>(
List.of (new Account ("Ilaha", "Jamalli", 100),
        new Account ("Laman", "Samadova", 200), 
        new Account ("Ali", "Alimli", 50), 
        new Account ("Zaur", "Aliyev", 70), 
        new Account ("Samad", "Hasanov", 70)));
 System.out.println(accs);
Collections.sort(accs);
Collections.sort(accs, new Comparator<Account> () {

// 

@Override
public int compare (Account o1, Account o2) {
 return o2.getBalance().compareTo(o1.getBalance ()) ; }
});
printList(accs);
}
static void printList(List<Account>accs){
        for(Account acc : accs)
        System.out.println(acc);
}
}