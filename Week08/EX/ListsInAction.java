import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsInAction {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(8);
        list1.add(2);
        list1.add(3);
        list1.add(0);

        System.out.println(list1.toString());

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        for (int x: list1) {
            System.out.print(x + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("meat");
        shoppingList.add("oranges");

        System.out.println(shoppingList.toString());
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }

        System.out.println();

        for (String x: shoppingList) {
            System.out.print(x + " ");
        }

        System.out.println();

        Iterator<String> iterator2 = shoppingList.iterator();
        while (iterator2.hasNext())
            System.out.print(iterator2.next() + " ");

        System.out.println();

        shoppingList.remove("bread");
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        System.out.println(shoppingList.toString());

        System.out.println();

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        newShoppingList.add("mushroom");
        newShoppingList.add("eggplant");

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