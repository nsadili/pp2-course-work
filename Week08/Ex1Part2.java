import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex1Part2 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

    Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

    //System.out.println(shoppingList);

    shoppingList.remove("bread");
    //System.out.println(shoppingList);

    shoppingList.remove(2);
    System.out.println("shoppingList: " + shoppingList);

    List<String> newshoppingList = new ArrayList<>(shoppingList);
    Collections.addAll(newshoppingList, "apple", "kiwi");

    System.out.println("newshoppingList: " + newshoppingList);

    String wordToFind = "teapot";
    //System.out.println(newshoppingList.contains(wordToFind)
    //    ? String.format("The new shopping list contains <%s>", wordToFind)
    //    : String.format("The new shopping list does not contain <%s>", wordToFind));

    List<String> linkedList = new LinkedList<>();
    Collections.addAll(linkedList, "tomato", "potato");
    linkedList.addAll(newshoppingList);

    System.out.println("linkedList: " + linkedList);
    
    ((LinkedList<String>)linkedList).removeFirst();
    System.out.println("linkedList: " + linkedList);

    ((LinkedList<String>)linkedList).removeLast();
    System.out.println("linkedList: " + linkedList);
}
}
