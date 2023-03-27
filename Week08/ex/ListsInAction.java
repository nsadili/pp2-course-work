import java.util.*;

public class ListsInAction {
    public static void main(String[] args) {
        // Part (a)
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);

        // Part (b)
        System.out.println("Using toString(): " + intList.toString());

        System.out.print("Using for loop: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Using enhanced for loop: ");
        for (int num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Using iterator: ");
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Part (c)
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println("Using toString(): " + shoppingList.toString());

        System.out.print("Using for loop: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Using enhanced for loop: ");
        for (String item : shoppingList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Using iterator: ");
        iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        shoppingList.remove("bread");

        System.out.println("After removing 'bread': " + shoppingList.toString());

        shoppingList.remove(2);

        System.out.println("After removing element at index 2: " + shoppingList.toString());

        // Part (d)
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println("Elements of newShoppingList: " + newShoppingList.toString());

        if (newShoppingList.contains("tea")) {
            System.out.println("The element 'tea' exists in the newShoppingList");
        } else {
            System.out.println("The element 'tea' does not exist in the newShoppingList");
        }

        // Part (e)
        List<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        newLinkedList.addAll(newShoppingList);

        System.out.println("Elements of newLinkedList: " + newLinkedList.toString());

        newLinkedList.remove(0);
        System.out.println("After removing the first element: " + newLinkedList.toString());

        newLinkedList.remove(newLinkedList.size() - 1);
        System.out.println("After removing the last element: " + newLinkedList.toString());
    }
}
