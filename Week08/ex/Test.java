import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
    ArrayList al = new ArrayList();
al.add("One");
al.add("Two");
al.add("Three");
Iterator it = al.iterator();
while (it.hasNext()) {
String s = (String) it.next();
System.out.println("Next element: " + s);
}

}
    
}