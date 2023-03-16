import java.util.ArrayList;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        ListIterator<String> it = al.listIterator(2);
        while (it.hasPrevious()) {
            String s = (String) it.previous();
            System.out.println("Next element: "+s);
        }
    }
}