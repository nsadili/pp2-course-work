import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsDemoB {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        // shoppingList.add("coffee");
        // shoppingList.add("tea");
        // shoppingList.add("bread");
        // shoppingList.add("butter");
        // shoppingList.add("eggs");

        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        // System.out.println(shoppingList.toString());
        
        // for(int i=0;i<shoppingList.size(); i++)
        //     System.out.println(shoppingList.get(i)+ " ");
        //     System.out.println();

        shoppingList.remove("bread");
        shoppingList.remove(2);

        System.out.println("ShoppingList: "+ shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "banana");

        System.out.println("NesShoppingList: "+ newShoppingList);

        // String wordToFind = "tea";

        // System.out.println(
        //     newShoppingList.contains(wordToFind) 
        //             ? String.format("The word <%s> does exist in the list\n", wordToFind)
        //             :String.format("The word <%s> does NOT exist in the list\n", wordToFind)
        // );

        List<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);

        System.out.println("NewLinkedList: "+ newLinkedList);

        ((LinkedList<String>)newLinkedList).removeFirst();
        ((LinkedList<String>)newLinkedList).removeLast();

        System.out.println("NewLinkedList: "+newLinkedList);
   }
}
