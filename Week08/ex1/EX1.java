package Week08.ex1;
import java.util.*;

public class EX1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Using toString() method: " + intList.toString());

        System.out.println("Using for statement:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        System.out.println("Using enhanced for statement:");
        for (int element : intList) {
            System.out.println(element);
        }

        System.out.println("Using iterator:");
        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println("Using toString() method: " + shoppingList.toString());

        System.out.println("Using for statement:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        System.out.println("Using enhanced for statement:");
        for (String element : shoppingList) {
            System.out.println(element);
        }

        System.out.println("Using iterator:");
        Iterator<String> stringIterator = shoppingList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        shoppingList.remove("bread");
        System.out.println("After removing 'bread': " + shoppingList.toString());

        shoppingList.remove(2);
        System.out.println("After removing the element at index 2: " + shoppingList.toString());
    }
}