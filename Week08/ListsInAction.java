package Week08;
import java.util.*;
public class ListsInAction {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        
        list01.add(7);
        list01.add(1);
        list01.add(3);
        list01.add(4);

        System.out.println(list01.toString());

        for (int i = 0; i < list01.size(); i++) {
            System.out.print(list01.get(i) + " ");
        }

        System.out.println();

        for (int x: list01) {
            System.out.print(x + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = list01.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

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

        for (String x: shoppingList) {
            System.out.print(x + " ");
        }

        System.out.println();

        Iterator<String> iterator01 = shoppingList.iterator();
        while (iterator01.hasNext())
            System.out.print(iterator01.next() + " ");

        System.out.println();

        shoppingList.remove("bread");
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        System.out.println(shoppingList.toString());

        System.out.println();

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        newShoppingList.add("kiwi");
        newShoppingList.add("apple");

        System.out.println(newShoppingList.toString());

        System.out.println("Element 'Tea' exists in the list: " + newShoppingList.contains("tea"));

        LinkedList<String> newLinkedList = new LinkedList<>();

        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        newLinkedList.addAll(newShoppingList);

        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());

        newLinkedList.removeLast();
        System.out.println(newShoppingList.toString());
    }
}
