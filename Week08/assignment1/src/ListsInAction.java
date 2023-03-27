import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println(integerList.toString());

        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();

        for (int i : integerList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println(shoppingList.toString());
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();
        for (String item : shoppingList) {
            System.out.print(item + " ");
        }
        System.out.println();
        Iterator<String> iterator2 = shoppingList.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        shoppingList.remove("bread");

        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println(newShoppingList.toString());

        if (newShoppingList.contains("tea")) {
            System.out.println("Tea exists in the new shopping list.");
        } else {
            System.out.println("Tea does not exist in the new shopping list.");
        }

        LinkedList<String> newLinkedList = new LinkedList<>();

        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        newLinkedList.addAll(newShoppingList);

        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());

        newLinkedList.removeLast();
        System.out.println(newLinkedList.toString());
    }
}
