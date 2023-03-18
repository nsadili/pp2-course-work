import java.util.Iterator;
import java.util.LinkedList;


public class ex1 {
    public static void main(String[] args) {
        // a
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(7);
        l1.add(-3);

        // b
        System.out.println(l1.toString());

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        for (int n: l1) {
            System.out.print(n + " ");
        }
        System.out.println();

        Iterator<Integer> it1 = l1.iterator();
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();
        System.out.println();

        // c
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        Iterator<String> it2 = shoppingList.iterator();
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(it2.next());
            if (i != shoppingList.size() - 1)
                System.out.print(", ");
        }
        System.out.println();

        shoppingList.remove("bread");

        it2 = shoppingList.iterator();
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(it2.next());
            if (i != shoppingList.size() - 1)
                System.out.print(", ");
        }
        System.out.println();

        shoppingList.remove(2);
        System.out.println();

        // d
        LinkedList<String> newShoppingList = shoppingList;
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        it2 = newShoppingList.iterator();
        for (int i = 0; i < newShoppingList.size(); i++) {
            System.out.print(it2.next());
            if (i != newShoppingList.size() - 1)
                System.out.print(", ");
        }
        System.out.println();

        it2 = newShoppingList.iterator();
        for (int i = 0; i < newShoppingList.size(); i++) {
            if (it2.next() == "tea") {
                System.out.println("\"tea\" found at index " + i);
                break;
            }
            if (i == newShoppingList.size() - 1)
                System.out.println("\"tea\" not found");
        }
        System.out.println();

        // e
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");

        for (String x: newShoppingList) {
            newLinkedList.add(x);
        }
        
        newLinkedList.removeFirst();
        for (String x: newLinkedList) {
            System.out.print(x + " ");
        }
        System.out.println();

        newLinkedList.removeLast();
        for (String x: newLinkedList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}