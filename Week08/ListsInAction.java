package Week08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListsInAction {


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        for(int i=0;i<list.size();i++){
         if(i==list.size()-1){
            System.out.println(list.get(i));
         } 
          else System.out.print(list.get(i)+", ");
        }
        for(int i:list){
            System.out.print(i+", ");

        }
        System.out.print("\n");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
        System.out.println("\n");
        ArrayList<String> shoppingList=new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        System.out.println(shoppingList.toString());
        for(int i=0;i<shoppingList.size();i++){
         if(i==shoppingList.size()-1){
            System.out.println(shoppingList.get(i));
         } 
          else System.out.print(shoppingList.get(i)+", ");
        }
        for(String i:shoppingList){
            System.out.print(i+", ");

        }
        System.out.print("\n");
        Iterator<String> it1=shoppingList.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+", ");
        }
        System.out.println("\n");
        ArrayList<String> newShoppingList=new ArrayList<>();
        newShoppingList.addAll(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        System.out.println(newShoppingList.toString());
        if(newShoppingList.indexOf("tea")==-1){
            System.out.println("Tea doesn't exist in the list.");
        }
        else System.out.println("Tea exists in the list.");
        System.out.println("\n");

        LinkedList<String> newLinkedList=new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        newLinkedList.addAll(newShoppingList);
        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());
        newLinkedList.removeLast();

        System.out.println(newLinkedList.toString());


    }
}
