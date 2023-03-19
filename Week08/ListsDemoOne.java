import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsDemoOne {

    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList , "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);

        shoppingList.remove("bread");
        shoppingList.remove(2);
        System.out.println(shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        System.out.println(newShoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println(newShoppingList);
        String wordToFind = "tea";
        System.out.println(wordToFind.contains("teas")
        ? "The new shopping list contains <tea>"
        : "The new shopping list does not contain <tea>");

        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);
        System.out.println("LinkedList: " + linkedList);

        ((LinkedList<String>)linkedList).removeFirst();

        System.out.println(linkedList);

        ((LinkedList<String>)linkedList).removeLast();
        System.out.println(linkedList);
    }
}
