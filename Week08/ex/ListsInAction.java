package Week08.ex;

import java.util.*;

public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(9);
        intList.add(7);
        intList.add(10);
        intList.add(13);

        printElements(intList);
        System.out.println();

        List<String> shoppingList = new ArrayList<String>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        printElements(shoppingList);
        System.out.println();

        shoppingList.remove("bread");

        printElements(shoppingList);
        System.out.println();

        shoppingList.remove(2);

        List<String> newShoppingList = new ArrayList<String>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");

        printElements(newShoppingList);
        System.out.println();

        System.out.println(
            String.format("The list does %scontain \"tea\"",
                newShoppingList.contains("tea") ? "" : "NOT ")
        );
        System.out.println();
        
        LinkedList<String> newLinkedList = new LinkedList<String>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);

        printElements(newLinkedList);
        System.out.println();

        newLinkedList.removeFirst();
        newLinkedList.removeLast();
        
        printElements(newLinkedList);
    }

    private static <T> void printElements(List<T> l) {
        System.out.println(l.toString());

        for (int i = 0; i < l.size(); i++) System.out.print(l.get(i) + " ");
        System.out.println();

        for (T el : l) System.out.print(el + " ");
        System.out.println();

        Iterator<T> it = l.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }
}
