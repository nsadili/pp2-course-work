import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringFunc {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Laman");
        lst.add("Rasul");
        lst.add("Nazrin");
        lst.add("Namaz");
        lst.add("Elnara");
        lst.add("ADA");
        lst.add("Panah");

        Collections.sort(lst, Comparator.comparingInt(String::length));
        System.out.println(lst);
        // how to say if the length is same sort alphabetically ???
        Collections.sort(lst, Comparator.comparingInt(String::length).reversed());
        System.out.println(lst);

    }
}
