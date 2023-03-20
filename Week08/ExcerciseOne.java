package Week08;
import java.util.*;

public class ExcerciseOne {
    public static void main(String[] args) {
        //////////////a//////////////////////////
        ArrayList <Integer> al = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            al.add(i);
        }

        ////////////////b///////////////////////
        System.out.println(al.toString());//toString method

        for(int i = 0; i < 10; i++) {//for loop
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        for(int x: al){//for each loop
            System.out.print(x + " ");
        }

        System.out.println();

        Iterator<Integer> it = al.iterator();//iterator
        while(it.hasNext()) {
            Integer n = it.next();
            System.out.print(n + " ");
        }

        System.out.println();

        /////////////////////c//////////////////////
        ArrayList<String> shoppingList = new ArrayList<>();
        /* 
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        */
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList.toString());

        shoppingList.remove("bread");
    
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        /////////////////d/////////////////////////
        ArrayList<String> newShoppingList = new ArrayList<>(shoppingList);

        System.out.println(newShoppingList.toString());
        
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println(newShoppingList.toString());

        if(newShoppingList.contains("tea")) System.out.println("the list contains 'tea' element");
        else System.out.println("the list does not contain the 'tea' element");

        //////////////////e///////////////////////////////
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomatao");
        newLinkedList.add("potato");
       
        /* 
        Iterator<String> it2 = newShoppingList.iterator();
        while(it2.hasNext()) {
            newLinkedList.add(it2.next());
        }
        */

        newLinkedList.addAll(newShoppingList);

        System.out.println(newLinkedList.toString());

        //newLinkedList.remove(0);
        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());
        //newLinkedList.remove(newLinkedList.size() - 1);
        newLinkedList.removeLast();
        System.out.println(newLinkedList.toString());
    }

} 