import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args){

        List<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        //shoppingList.add("coffee");
        //shoppingList.add("tea");
        //shoppingList.add("bread");
        //shoppingList.add("butter");
        //shoppingList.add("eggs");


        shoppingList.remove("bread");
        shoppingList.remove(2);

        System.out.println("Shopping List: " + shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");

        System.out.println("New Shopping List: " + newShoppingList);

        String wordToFind = "tea";
        System.out.println(
            newShoppingList.contains(wordToFind)
            ? String.format("The word <%s> does exist in the list\n", wordToFind)
            : String.format("The word <%s> does NOT exist in the list\n", wordToFind)
        );

        List<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);

        System.out.println("Linked List: " + newLinkedList);

        newLinkedList.remove(0);
        newLinkedList.remove(newLinkedList.size() - 1);

        //((LinkedList<String>)newLinkedList).removeFirst();
        //((LinkedList<String>)newLinkedList).removeLast();

        System.out.println("Linked List: " + newLinkedList);
    }
    
}
