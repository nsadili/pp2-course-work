package Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("“A”");
        ll.add("“B”");
        ll.add("“C”");
        ll.addLast("“Y”");
        ll.addFirst("“X”");
        System.out.println("“The last element is: ”" +
                ll.getLast());
        for (Object s : ll) {
            System.out.println(s);
        }


        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        
        ListIterator it = al.listIterator();
        while (it.hasPrevious()) {
            String s = (String) it.previous();
            System.out.println("“Next element: " + s);
        }

        for (String a : al) {System.out.println(a);}
    

    }
}
