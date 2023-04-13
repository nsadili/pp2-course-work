package Week11.LectureTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

interface Sorting <T extends Comparable<? super T>>{
    public void sort(Collection<T> list);
}

public class LectureEX {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 39, 23, 42, 7, 18, 25, 13);
        // Sorting<Integer> sortInt = list -> {
        //     Collections.sort((List<Integer>) list, Comparator.reverseOrder());
        // };
        ints.sort((a, b) -> b.compareTo(a));
        System.out.println(ints);


        List<String> strings = Arrays.asList("Rufat", "Shamil", "Arzum", "Nariman", "Mahammad");
        strings.sort((a,b)->{
            // if (a.equals(b)) return b.compareTo(a);
            return b.compareTo(a);
        });
        System.out.println(strings);  


        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Shamil", "Abbasov", 1600.0));
        accounts.add(new Account("Muhammad", "Abdullazada", 800.0));
        accounts.add(new Account("Arzum", "Abdullazada", 300.0));
        accounts.add(new Account("Arzum", "Abdullazada", 800.0));
        accounts.add(new Account("Muhammad", "Mammadzada", 0.0));

        accounts.sort((a,b)->{
            if (a.balance==b.balance) return a.firstname.compareTo(b.firstname);
            return b.balance.compareTo(a.balance);
        });
        System.out.println(accounts);  


    }
}
