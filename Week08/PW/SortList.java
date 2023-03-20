import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Asgar");
        myList.add("Huseynli");
        myList.add("Hello");

        Collections.sort(myList);
        System.out.println(myList);

        myList.sort(null);
        System.out.println(myList);


        Collections.sort(myList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(myList);

        Collections.sort(myList, new MyComparator());
        System.out.println(myList);
    }

    static class MyComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}