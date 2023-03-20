import java.util.*;
import java.util.Collections;

public class ListsInAction1 {
    public static void main(String[] args) {
        
        ArrayList<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList,
                             "coffe", "tea", "bread", "butter", "eggs");
        shoppingList.add("coffe");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        System.out.println(shoppingList);
        shoppingList.remove("bread");
        System.out.println(shoppingList);
        shoppingList.remove(2);
        System.out.println(shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        System.out.println(newShoppingList);

    }
}
