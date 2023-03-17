import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<String>();

        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);
        shoppingList.remove("bread");
        System.out.println(shoppingList);
        shoppingList.remove(2);
        System.out.println(shoppingList);
        System.out.println("Shopping List: " + shoppingList);


        List<String> newShoppingList = new ArrayList<>(shoppingList); //we can add the previous list here because LIT exdends COLLECTION
        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println("New Shopping List " + newShoppingList);
        // String a = "tea";
        // // System.out.println(
        // //     if(newShoppingList.contains(a)){
        // //         String.format("The word <%s> exists", a);
        // //     } else String.format("The word <%s> does not exist", a)
        // // );


        LinkedList<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomoto", "potato");

        System.out.println("Linked List: " + newLinkedList);

        // newLinkedList.remove(0); // remove first
        // System.out.println("1.1) "+newLinkedList);
        // newLinkedList.remove(newLinkedList.size()-1); // remove last
        // System.out.println("1.2) "+newLinkedList);

        newLinkedList.removeFirst(); //PROBLEM here
        System.out.println("2.1) "+newLinkedList);
        newLinkedList.removeLast();
        System.out.println("2.2) "+newLinkedList);
    }
}
