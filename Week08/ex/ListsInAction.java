import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsInAction{
    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(8);
        myList.add(6);

        myList.remove(1);
        myList.remove(Integer.valueOf(1));
        System.out.println(myList.toString());
        
        for(int i=0; i < myList.size(); i++)
        System.out.println(myList.get(i) + " ");
        System.out.println();



        for(Integer el : myList)
        System.out.println(el + " ");
        System.out.println();

        Iterator<Integer> it = ((ArrayList<Integer>)myList).iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");

        }
        System.out.println();
        
        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        System.out.println();
        System.out.println(shoppingList.toString());
    

        shoppingList.remove("bread");
        System.out.println(shoppingList.toString());
        shoppingList.remove(2);
        System.out.println(shoppingList.toString());

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        for(String el : newShoppingList) {
            System.out.println(el);
        }
        if (newShoppingList.contains("tea")) {
            System.out.println("New shopping list contains tea");
        } else {
            System.out.println("Did not find tea in new shopping list");
        }
        List<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        newLinkedList.addAll(newShoppingList);
        
        newLinkedList.remove(0);
        System.out.println(newLinkedList.toString());
        newLinkedList.remove(newLinkedList.size()-1);
        System.out.println(newLinkedList.toString());
    }
}
   