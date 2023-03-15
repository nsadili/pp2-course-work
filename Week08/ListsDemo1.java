import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo1 {
    public static void main(String[] args) {
        List<String> shoppingList= new ArrayList<>();
        Collections.addAll(shoppingList, 
        "coffee", "tea", "bread", "butter", "eggs");
        
        /*shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");*/

        //System.out.println(shoppingList);
        
        shoppingList.remove("bread");
        //System.out.println(shoppingList);
        shoppingList.remove(2);
        System.out.println("shopping list: "+shoppingList);

        List<String> newShoppingList= new ArrayList<>(shoppingList);
        System.out.println("new shopping list: "+newShoppingList);
        Collections.addAll(newShoppingList,
        "kiwi", "apple");
        System.out.println("new shopping list: "+newShoppingList);
        String word="teapot";
        System.out.println(newShoppingList.contains(word)
        ? String.format("New shopping list has %s",word)
        : String.format("New shopping list does not have %s",word));

        List<String> linkedList= new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);

        System.out.println("linkedList: "+linkedList);
        
        ((LinkedList<String>) linkedList).removeFirst();
        System.out.println("linkedList: "+linkedList);
        ((LinkedList<String>) linkedList).removeLast();
        System.out.println("linkedList: "+linkedList);

    }
}
