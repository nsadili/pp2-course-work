package ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class shoppingList {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);

        shoppingList.remove("bread");
        shoppingList.remove(2);

        System.out.println("Shopping list:" + shoppingList);
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");
        // String wordToFind="tea";

        // System.out.println(String.format("the word <%s> %s",wordToFind,
        // newShoppingList.contains(wordToFind)?"does exists":"does not exists"));
        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);
        System.out.println("Linked list:" + linkedList);
        ((LinkedList<String>) linkedList).removeFirst();
        ((LinkedList<String>) linkedList).removeLast();
        System.out.println("Linked list:" + linkedList);

    }

}
