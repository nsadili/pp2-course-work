package Week08;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        
        
        List<Integer> myIntList = new ArrayList<>();
        
        myIntList.add(10);
        
        myIntList.add(20);
        
        myIntList.add(30);

        
        System.out.println(myIntList.toString()); 


        
        for (int i = 0; i < myIntList.size(); i++) {
        
            System.out.println(myIntList.get(i));
        
        }


        
        for (int i : myIntList) {
                
            System.out.println(i);
        
        }
        

        
        Iterator<Integer> iter = myIntList.iterator();
        
        while (iter.hasNext()) {
        
            System.out.println(iter.next());
        
        }


        
        List<String> shoppingList = new ArrayList<>();
        
        
        shoppingList.add("coffee");
        
        shoppingList.add("tea");
        
        shoppingList.add("bread");
        
        shoppingList.add("butter");
        
        shoppingList.add("eggs");


        
        System.out.println(shoppingList.toString());


        
        for (String string : shoppingList) {
        
            System.out.println(shoppingList.toString());
        
        }


        
        shoppingList.remove("bread");
        
        System.out.println(shoppingList.toString());
        
        shoppingList.remove(2);


        
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        
        newShoppingList.add("apple");
        
        newShoppingList.add("kiwi");

        
        System.out.println(newShoppingList.toString());


        
        if (newShoppingList.contains("tea")) {
        
            System.out.println("exists");
        
        } else {
        
            System.out.println("does not exist");
        
        }


        
        LinkedList<String> newLinkedList = new LinkedList<>();
        
        newLinkedList.add("tomato");
        
        newLinkedList.add("potato");
        
        newLinkedList.addAll(newShoppingList);


        
        newLinkedList.removeFirst();
        
        

        System.out.println(newLinkedList.toString());

        
        newLinkedList.removeLast();

        
        System.out.println(newLinkedList.toString());


    }
}
