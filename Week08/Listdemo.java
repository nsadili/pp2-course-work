import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args){
        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "bread", "milk", "cookie", "cheese");
        System.out.println(shoppingList);
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        System.out.println(newShoppingList);

        List<String> LinkedList = new LinkedList<>();
        Collections.addAll(LinkedList, "bread","eggs");
        LinkedList.addAll(newShoppingList);
        System.out.println(LinkedList);
        ((LinkedList<String>)LinkedList).removeFirst();
        System.out.println(LinkedList);
    }
}