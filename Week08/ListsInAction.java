package week08;
import java.util.*;
public class ListsInAction {

        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);
            intList.add(3);

            System.out.println(intList.toString());

            for (int i = 0; i < intList.size(); i++) {
                System.out.println(intList.get(i));
            }

            for (int num : intList) {
                System.out.println(num);
            }

            Iterator<Integer> iterator = intList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            List<String> shoppingList = new ArrayList<>();
            shoppingList.add("coffee");
            shoppingList.add("tea");
            shoppingList.add("bread");
            shoppingList.add("butter");
            shoppingList.add("eggs");

            System.out.println(shoppingList.toString());
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println(shoppingList.get(i));
            }
            for (String item : shoppingList) {
                System.out.println(item);
            }
            Iterator<String> iterator2 = shoppingList.iterator();
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next());
            }

            shoppingList.remove("bread");
            System.out.println(shoppingList.toString());

            shoppingList.remove(2);
            System.out.println(shoppingList.toString());

            List<String> newShoppingList = new ArrayList<>(shoppingList);

            newShoppingList.add("apple");
            newShoppingList.add("kiwi");
            System.out.println(newShoppingList.toString());

            if (newShoppingList.contains("tea")) {
                System.out.println("Tea is in the new shopping list");
            } else {
                System.out.println("Tea is not in the new shopping list");
            }

            LinkedList<String> newLinkedList = new LinkedList<>();
            newLinkedList.add("tomato");
            newLinkedList.add("potato");

            newLinkedList.addAll(newShoppingList);
            System.out.println(newLinkedList.toString());

            newLinkedList.removeFirst();
            newLinkedList.removeLast();
            System.out.println(newLinkedList.toString());
        }
    }