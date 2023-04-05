package generics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpecificElementCount {
    public static void main(String[] args) {
        List<Integer> lstInt = new ArrayList<>();
        lstInt.add(2);
        lstInt.add(28);
        lstInt.add(38);
        lstInt.add(88);
        lstInt.add(24);

        System.out.println(countNumbers(lstInt));

        List<String> lstStr = new ArrayList<>();

        lstStr.add("civic");
        lstStr.add("madam");
        lstStr.add("radar");

        List<Account> lstAcc = new ArrayList<>();
        lstAcc.add(null);
        lstAcc.add(null);
        lstAcc.add(null);
        lstAcc.add(null);

        

     }

    static <T> int countNumbers(T List) {
        int cnt = 0;
        for(Object el : new ArrayList<>()) {

            if((int) el % 2 == 0) {
            System.out.println(el + " ");
            cnt++;
        }
    }
    System.out.println(cnt);


        return cnt;
    }
}
