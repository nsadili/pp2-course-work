package listofactions;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<String>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        //1)
        System.out.println(shoppingList.toString());

        //2)
        // System.out.print("[");
        // for(int i=0; i<shoppingList.size(); i++) {
        //     System.out.print(shoppingList.get(i));
        //     if(i != shoppingList.size() - 1){
        //         System.out.print(", ");
        //     } else{
        //         System.out.print("]");
        //     }
        // }

        //3)
        // System.out.print("[");
        // for(String i: shoppingList) {
        //     System.out.print(i);
        //     if(i != shoppingList.get(shoppingList.size() - 1)){
        //         System.out.print(", ");
        //     } else{
        //         System.out.print("]");
        //     }
        // }

        //4)
        // Iterator<String> it = shoppingList.iterator();
        // System.out.print("[");
        // while(it.hasNext()) {
        //     String str = it.next();
        //     System.out.print(str+", ");
        // }
        // System.out.print("]");


        shoppingList.remove("bread");
        // System.out.println(shoppingList.toString());
        shoppingList.remove(2);
        // System.out.println(shoppingList.toString());


        List<String> newShoppingList = shoppingList;
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        // System.out.println(newShoppingList.toString());
        // if(newShoppingList.contains("tea")) {
        //     System.out.println("tea is in the list");
        // } else {
        //     System.out.println("tea is not in the list");
        // }


            List<String> newLinkedList = new LinkedList<String>();
            newLinkedList.add("tomato");
            newLinkedList.add("potato");
            for(String i: newShoppingList) {
                newLinkedList.add(i);
            }
            System.out.println(newLinkedList.toString());
            newLinkedList.remove(0);
            System.out.println(newLinkedList.toString());
            newLinkedList.remove(newLinkedList.size() - 1);
            System.out.println(newLinkedList.toString());
    }

}
