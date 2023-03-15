import java.util.*;
class ArrayListDemo{
public static void main(String args[]) {
ArrayList al = new ArrayList();
al.add("A");                 // ABCDE
al.add("B");
al.add("C");
al.add("D");
al.add("E");
System.out.println("Array size: "+al.size());
al.remove("C");
al.remove(2);
al.set(0,"X");
System.out.println("Array size: "+al.size());
for (int i=0; i<al.size(); i++)
System.out.println(al.get(i));
}
}
