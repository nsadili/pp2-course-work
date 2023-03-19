import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
    
        List<String> shoppingList= new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        //System.out.println(shoppingList);


        shoppingList.remove("bread");
        shoppingList.remove(2);

        System.out.println("ShoppingList: "+ shoppingList);


        List<String> newShoppingList= new ArrayList<>(shoppingList);
        System.out.println("NewShoppingList:"+ newShoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println("NewShoppingList:"+ newShoppingList);



        String workToFind = "tea";
        System.out.println(
            newShoppingList.contains(workToFind)
            ? String.format("The word <%s> does exist in the list\n",workToFind)
            :String.format("The word <%s> does NOT exist in the list\n",workToFind)
        );


    List<String> linkedList= new LinkedList<>();
    Collections.addAll(linkedList, "tomato", "potato");
    linkedList.addAll(newShoppingList);

    System.out.println("LinkedList: "+linkedList);

    ((LinkedList<String>)linkedList).removeFirst();
    ((LinkedList<String>)linkedList).removeLast();
    System.out.println(linkedList);




    }
}