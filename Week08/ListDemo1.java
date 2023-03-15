package Week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args){

        ArrayList<String> ShoppingList = new ArrayList<>();

        Collections.addAll(ShoppingList, "coffee", "tea", "bread", "butter", "eggs");


        ShoppingList.remove("bread");
        // System.out.println(ShoppingList);
        
        ShoppingList.remove(2);
        System.out.println("ShoppingList: " +ShoppingList);

        List<String> newShoppingList = new ArrayList<>(ShoppingList);

        System.out.println("newShoppingList: " +newShoppingList);

        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println("newShoppingList: " +newShoppingList);

        String WordToFind = "tea";
        System.out.println(newShoppingList.contains(WordToFind)
        ? String.format("The newShoppingList contains <%s>" , WordToFind)
        : String.format("The newShoppingList does not contain <%s>" , WordToFind));
        

        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");

        linkedList.addAll(newShoppingList);

        System.out.println("linkedList: " + linkedList);
        ((LinkedList<String>)linkedList).removeFirst();
        System.out.println("linkedList: " + linkedList);
        ((LinkedList<String>)linkedList).removeLast();
        System.out.println("linkedList: " + linkedList);


    }
}
