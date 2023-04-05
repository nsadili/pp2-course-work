//package Week08.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        
        List<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList, 
            "coffee", "tea", "bread", "butter", "eggs");
        
        System.out.println(shoppingList);

        shoppingList.remove("bread");
        shoppingList.remove(2);

        System.out.println(shoppingList);

        List <String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");

        System.out.println("NewShoppingList: " + newShoppingList);

        String wordToFind = "tea";

        System.out.println(
            newShoppingList.contains(wordToFind)
                ? String.format("The word <%s> does exist in the list\n", wordToFind)
                : String.format("The word <%s> does NOT exist in the list", wordToFind)
        );

        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);

        System.out.println("LinkedList: " + linkedList);

        ((LinkedList<String>) linkedList).removeFirst();
        ((LinkedList<String>) linkedList).removeLast();

        System.out.println("LinkedList: " + linkedList);

    }
}
