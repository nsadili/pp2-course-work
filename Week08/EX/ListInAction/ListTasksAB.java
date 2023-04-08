import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTasksAB {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.print("i. toString() method: ");
        System.out.println(intList.toString());

        System.out.print("ii. for statement: ");
        for(int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();

        System.out.print("iii. enhanced for statement: ");
        for (int i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("iv. iterator: ");
        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
