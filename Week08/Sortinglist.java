package Week08;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sortinglist { 
public static void main(String[] args){
    List<Account> accs=new ArrayList<>();
    Collections.sort(accs, new DescendingComparator());

} }
     static class DescendingComparator implements Comparator<Integer> {
public int compare(Account o1, Account o2 ){
    return Double.compare(a2.getBalance(), a1.getBalance());
}
   } 