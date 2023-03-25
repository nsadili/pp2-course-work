package Week08.Ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringListExample {
    static List<String> shoppingList = new ArrayList<String>();
    static List<String> newShoppingList = new ArrayList<String>();
    static LinkedList<String> newLinkedList = new LinkedList<>();

    public static void main(String[] args) {

        // add some elements
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        printAllMethods(shoppingList);

        // remove bread
        shoppingList.remove("bread");
        printAllMethods(shoppingList);

        // remove index 2
        shoppingList.remove(2);
        printAllMethods(shoppingList);

        newShoppingList = shoppingList;
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        printAllMethods(newShoppingList);

        if (newShoppingList.contains("tea")) {
            System.out.println("New Shopping List contains tea");
        }
        // adding some elements to newLinkedList
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        // adding newShoppingList to newLinkedList
        newLinkedList.addAll(newShoppingList);
        printAllMethods(newLinkedList);
        newLinkedList.removeFirst();
        printAllMethods(newLinkedList);
        newLinkedList.removeLast();
        printAllMethods(newLinkedList);

    }

    public static void printAllMethods(List<String> shoppingList) {
        // print the elements using the toString() method
        System.out.println("Using toString() method: " + shoppingList.toString());

        // print the elements using a for statement
        System.out.print("Using for statement: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();

        // print the elements using an enhanced for statement
        System.out.print("Using enhanced for statement: ");
        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // print the elements using an iterator
        System.out.print("Using iterator: ");
        Iterator<String> iter = shoppingList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

}
