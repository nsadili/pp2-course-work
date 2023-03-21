import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> shoppingList= new ArrayList<>();

        Collections.addAll(shoppingList,"coffee" , "tea" , "bread"  , "butter" , "egg");

        shoppingList.remove("bread");
        

        shoppingList.remove(2);
        System.out.println("shoppingLIst: " + shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList , "kiwi" , "apple");
        System.out.println("new ShoppingList: "+newShoppingList);

       List<String> linkedList = new LinkedList<>();
       Collections.addAll(linkedList, "tomato" , "potato");
       linkedList.addAll(newShoppingList);
       System.out.println("LinkedList: " + linkedList );
       
       ((LinkedList<String>) linkedList).removeFirst();
       System.out.println("LinkedList: " + linkedList );

       ((LinkedList<String>) linkedList).removeLast();
       System.out.println("LinkedList: " + linkedList );




    }
    
}