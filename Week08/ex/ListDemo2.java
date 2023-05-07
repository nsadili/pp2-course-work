import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread");
        System.out.println(shoppingList);
        shoppingList.remove("bread");
        
        System.out.println("ShoppingList: " + shoppingList);
       List<String> newShoppingList = new ArrayList<>(shoppingList);
       Collections.addAll(newShoppingList, "apple", "kiwi");
       System.out.println(newShoppingList);
       String wordTofind = "tea";
       System.out.println(newShoppingList.contains(wordTofind)
       ? String.format("The word <%s> does exist in the list\n", wordTofind)
       : String.format("The word <%s> does not exist in the list\n", wordTofind));


       List<String> linkedList = new LinkedList<>();
       Collections.addAll(linkedList, "tomato", "potato");
       linkedList.addAll(newShoppingList);
       System.out.println("LinkedList: " + linkedList);
       ((LinkedList<String>) linkedList).removeFirst();
       System.out.println("LinkedList: " + linkedList);
        }
}
