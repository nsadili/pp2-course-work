import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsOfIntegers {
    public static void main(String[] args) {
        // Exercise 1a
        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(2);
        intList.add(4);
        intList.add(6);
        intList.add(8);
        intList.add(10);

        // Exercise 1b(i)
        System.out.println(intList.toString());

        // Exercise 1b(ii)
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i));
            if (i < intList.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Exercise 1b(iii)
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i));
            if (i < intList.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Exercise 1b(iv)
        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Exercise 1c
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        // Exercise 1c(ii)
        System.out.println(shoppingList.toString());

        // Exercise 1c(iii)
        shoppingList.remove("bread");

        // Exercise 1c(iv)
        System.out.println(shoppingList.toString());

        // Exercise 1c(v)
        shoppingList.remove(2);

        // Exercise 1d
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        // Exercise 1d(ii)
        System.out.println(newShoppingList.toString());

        // Exercise 1d(iii)
        if (newShoppingList.contains("tea")) {
            System.out.println("Tea is in the list.");
        } else {
            System.out.println("Tea is not in the list.");
        }

        // Exercise 1e
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        newLinkedList.addAll(newShoppingList);

        // Exercise 1e(iii)
        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());

        // Exercise 1e(iv)
        newLinkedList.removeLast();
        System.out.println(newLinkedList.toString());

        // Exercise 2i
        Collections.sort(intList);

        // Exercise 2ii
        newShoppingList.sort(null);

        // Exercise 2iii(i)
        Comparator<Integer> comp1 = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };
        intList.sort(comp1);

        // Exercise 2iii(ii)
        Comparator<String> comp2 = new ShoppingListComparator();
        shoppingList.sort(comp2);

        // Exercise 2b
        System.out.println(intList.toString());
        System.out.println(newShoppingList.toString());
        System.out.println(shoppingList.toString());
    }

    // Exercise 2iii(ii)
    public static class ShoppingListComparator implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}