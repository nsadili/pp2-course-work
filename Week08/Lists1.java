package Week08;
import java.util.*;
public class Lists1 {
    public static void main(String[] args) {
        List<String> shoppingList= new ArrayList<>();
        Collections.addAll(shoppingList,
                 ...elements: "coffee", "tea", "bread", "butter", "eggs");
    System.out.println(shoppingList);
    shoppingList.remove(o: "bread");
    System.out.println(shoppingList);
    shoppingList.remove(index: 2);
    System.out.println(shoppingList);
    List<String> newShoppingList= new ArrayList<>(shoppingList);
    

    Collections.addAll(newShoppingList, ...elements: "apple", "kiwi");
    System.out.println("newShoppingList:" +newShoppingList);

    String wordToFind= "teapot";
    System.out.println(newShoppingList.contains(wordToFind)
    ?"The new shopping list contains <tea>"
    :"The new shopping list does not contain <tea>");
    List<String> linkedList= new LinkedList<>();
    Collections.addAll(linkedList, ...elements: "tomato", "potato");
    linkedList.addAll(newShoppingList);

    System.out.println("linkedList: " + linkedList);
    ((LinkedList)linkedList).removeFirst();
    System.out.println("linkedList: " + linkedList);
    ((LinkedList)linkedList).removeLast();
    System.out.println("linkedList: " + linkedList);

    }
}
