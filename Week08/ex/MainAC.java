import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAC {
    public static void main(String[] args){// throws InvalidAmountException {
        List<Account> accs = new ArrayList<>(
            List.of(
                new Account("Shamil", "Abbasov", 5000),
                new Account("Nariman", "Mammadov", 6000),
                new Account("Rufat", "Hajizada", 4000)
            )
        );
        //System.out.println(accs);

        //Collections.sort(accs);

        @Override
        public int compare(Account o1, Account o2){
            return o2.getBalance().compareTo(o1.getBalance());
        }

        System.out.println(accs);
        
        // public static void printList(){
        //     for(Account acc: accs){
        //         System.out.println(acc);
        //     }
        // }
    }
}
