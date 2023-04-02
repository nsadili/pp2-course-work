import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInAction {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));

        System.out.println("Elements of integerList using toString(): " + integerList.toString());

        System.out.print("Elements of integerList using for-each loop: ");
        for (Integer element : integerList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Elements of integerList using iterator: ");
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        List<String> shoppingList = new ArrayList<>(List.of("coffee", "tea", "bread", "butter", "eggs"));

        System.out.println("Elements of shoppingList using toString(): " + shoppingList.toString());

        System.out.print("Elements of shoppingList using for-each loop: ");
        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Elements of shoppingList using iterator: ");
        Iterator<String> shoppingListIterator = shoppingList.iterator();
        while (shoppingListIterator.hasNext()) {
            System.out.print(shoppingListIterator.next() + " ");
        }
        System.out.println();

        shoppingList.remove("bread");

        System.out
                .println("Elements of shoppingList after removing bread using toString(): " + shoppingList.toString());
        System.out.print("Elements of shoppingList after removing bread using for-each loop: ");
        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        shoppingList.remove(2);

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println("Elements of newShoppingList using toString(): " + newShoppingList.toString());

        System.out.print("Elements of newShoppingList using for-each loop: ");
        for (String element : newShoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Elements of newShoppingList using iterator: ");
        Iterator<String> newShoppingListIterator = newShoppingList.iterator();
        while (newShoppingListIterator.hasNext()) {
            System.out.print(newShoppingListIterator.next() + " ");
        }
        System.out.println();

        if (newShoppingList.contains("tea")) {
            System.out.println("Element tea exists in newShoppingList");
        } else {
            System.out.println("Element tea does not exist in newShoppingList");
        }

        Collections.sort(newShoppingList);

        System.out.println("Sorted elements of newShoppingList using toString(): " + newShoppingList.toString());

        System.out.print("Sorted elements of newShoppingList using for-each loop: ");
        for (String element : newShoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Sorted elements of newShoppingList using iterator: ");
        Iterator<String> sortedNewShoppingListIterator = newShoppingList.iterator();
        while (sortedNewShoppingListIterator.hasNext()) {
            System.out.print(sortedNewShoppingListIterator.next() + " ");
        }
        System.out.println();
    }
}