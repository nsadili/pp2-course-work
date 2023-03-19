import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsinAction {
public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

   
    System.out.println(numbers.toString());


    for(int i=0; i<numbers.size(); i++) {
        System.out.print(numbers.get(i) + " ");
    }
    System.out.println();

  
    for(int number : numbers) {
        System.out.print(number + " ");
    }
    System.out.println();


    Iterator<Integer> iterator = numbers.iterator();
    while(iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    System.out.println();

  
    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("tea");
    shoppingList.add("bread");
    shoppingList.add("butter");
    shoppingList.add("eggs");

 
    System.out.println(shoppingList.toString());


    for(int i=0; i<shoppingList.size(); i++) {
        System.out.print(shoppingList.get(i) + " ");
    }
    System.out.println();


    for(String item : shoppingList) {
        System.out.print(item + " ");
    }
    System.out.println();

    Iterator<String> shoppingListIterator = shoppingList.iterator();
    while(shoppingListIterator.hasNext()) {
        System.out.print(shoppingListIterator.next() + " ");
    }
    System.out.println();


    shoppingList.remove("bread");


    System.out.println(shoppingList.toString());


    shoppingList.remove(2);

 
    System.out.println(shoppingList.toString());

 
    List<String> newShoppingList = new ArrayList<>(shoppingList);


    newShoppingList.add("apple");
    newShoppingList.add("kiwi");


    System.out.println(newShoppingList.toString());

 
    if(newShoppingList.contains("tea")) {
        System.out.println("The new shopping list contains tea.");
    } else {
        System.out.println("The new shopping list does not contain tea.");
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

