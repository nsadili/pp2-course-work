import java.util.*;

public class ListsInAction {
    public static void main(String[] args){
        List<Integer> alist=new ArrayList<>();
        alist.add(5);
        alist.add(4);
        alist.add(8);
        alist.add(10);
        System.out.println(alist.toString());
        
        for(int i=0;i<alist.size();i++){
            System.out.print(alist.get(i) +" ");
        }

        System.out.println();
        
        for(int i:alist){
            System.out.print(i+" ");
        }

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println();

        System.out.println(shoppingList.toString());
        
        for(int i=0;i<shoppingList.size();i++){
            System.out.print(shoppingList.get(i) +" ");
        }

        System.out.println();
        
        for(String i:shoppingList){
            System.out.print(i+" ");
        }
        shoppingList.remove("bread");
       
        System.out.println();

        for(String i:shoppingList){
            System.out.print(i+" ");
        }

        shoppingList.remove(2);

        List<String> newShoppingList=new ArrayList<>(shoppingList);

        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println();

        System.out.println(newShoppingList.toString());

        if(newShoppingList.contains("tea")) System.out.println("contains");
        else System.out.println("does not contain");    

        LinkedList<String> newLinkedList=new LinkedList<>();
        System.out.println();
        
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        
        newLinkedList.addAll(newShoppingList);

        newLinkedList.removeFirst();
        
        System.out.println(newLinkedList.toString());

        newLinkedList.removeLast();
        
        System.out.println(newLinkedList.toString());

    }
}