package Week08.Ex1;

import java.util.ArrayList;

public class d {
    public static void main(String[] args) {
        ArrayList<String> newShoppingList = new ArrayList<String>();

        newShoppingList.add("coffee");
        newShoppingList.add("tea");
        newShoppingList.add("bread");
        newShoppingList.add("butter");
        newShoppingList.add("eggs");
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println(newShoppingList);

        if (newShoppingList.contains("tea")) {
            System.out.println("There is tea in the list...");
        } else {
            System.out.println("There is not tea in the list...");
        }
    }
}
