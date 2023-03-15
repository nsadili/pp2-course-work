import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
al.add("One");
al.add("Two");
al.add("Three");
ListIterator it = 
al.listIterator(al.size());
while (it.hasPrevious()) {
String s = (String) it.previous();
System.out.println("Next element: " + s);
}

    }
}
