import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
public class AccountDemo {
    public static void main(String[] args) {
        //static list
        List<Account> nameList = new ArrayList<>(
            List.of(
                new Account("Ali", "Aliyev", 2000.0),
                new Account("Vusal", "Mammadov", 3000.0),
                new Account("Fikrat", "Babayev", 3050.0)
            )
        );
        printList(nameList);


        Collections.sort(nameList, new Comparator<Account>(){
            @Override
            public int compare(Account a1, Account a2){
                return a1.getBalance().compareTo(a2.getBalance());
            }
        });
    }
    
    static void printList(List<Account> nameList){
        for(Account o: nameList){
            System.out.println(o);
        }
    }



}

/* 
class DescendingOrder implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o1.compareTo(o2);
    }
}

Collection.sort(nums, new DescendingComparator)
*/