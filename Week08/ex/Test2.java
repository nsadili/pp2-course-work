import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
ll.add("A");      // XABCY
ll.add("B");
ll.add("C");
ll.addLast("Y");
ll.addFirst("X");
System.out.println("The last element is: " + 
ll.getLast());
for (Object s : ll) {
System.out.print(s + " ");
}

    }
}
