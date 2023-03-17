package Week08;

import java.util.*;
public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
        intList1.add(2);
        intList1.add(3);

        System.out.println(intList1.toString());
        for (int i = 0; i<intList1.size(); i++);
        System.out.println(intList1.get(1));
        for (int num : intList1) {
            System.out.println(num);
        }
        Iterator<Integer> it1 = intList1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        List<String> shoppingList1 = new ArrayList<>();
        shoppingList1.add("coffee");
        shoppingList1.add("tea");
        shoppingList1.add("bread");
        shoppingList1.add("butter");
        shoppingList1.add("eggs");
        System.out.println(shoppingList1.toString());
        shoppingList1.remove("bread");
        System.out.println(shoppingList1.toString());
        shoppingList1.remove(2);
        List<String> newShoppingList1 = new ArrayList<>(shoppingList1);
        newShoppingList1.add("apple");
        newShoppingList1.add("kiwi");
        System.out.println(newShoppingList1.toString());
        if (newShoppingList1.contains("tea")) {
            System.out.println("the element tea exists in this list :)");
        }
        else {
            System.out.println("the element tea doesn't exist in this list :(");
        }
        LinkedList<String> newLinkedList1 = new LinkedList<>();
        newLinkedList1.add("tomato");
        newLinkedList1.add("potato");
        newLinkedList1.addAll(newShoppingList1);
        newLinkedList1.removeFirst();
        System.out.println(newLinkedList1.toString());
        newLinkedList1.removeLast();
        System.out.println(newLinkedList1.toString());
    }
}
