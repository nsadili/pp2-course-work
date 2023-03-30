package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args ){
        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);
        shoppingList.remove("bread");
        shoppingList.remove(2);
        System.out.println(shoppingList);
        List<String> newShoppingList = new ArrayList<String>(shoppingList);
        Collections.addAll(newShoppingList, "apple","kiwi");
        System.out.println("NewShoppinglist: "+ newShoppingList);
        String wordToFind = "tea";
        System.out.println(newShoppingList.contains(wordToFind) ? String.format("The word <%s> does exits in the list\n", wordToFind) :
        String.format("The word <%s> does not exists\n ", wordToFind ));

        List<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);
        System.out.println("linkedList"+ newLinkedList);
        ((LinkedList<String>) newLinkedList).removeLast();
        ((LinkedList<String>) newLinkedList).removeFirst();
        System.out.println("new newLinkedList: " + newLinkedList);
    }
    
}
