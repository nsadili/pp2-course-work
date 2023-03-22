package Week08;
import java.util.*;

public class listsinaction {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> myList = new ArrayList<>();

        // add some elements to the list
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // print the elements using toString() method
        System.out.println("toString() method: " + myList.toString());

        // print the elements using a for loop
        System.out.print("for loop: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // print the elements using an enhanced for loop
        System.out.print("enhanced for loop: ");
        for (int element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // print the elements using an iterator
        System.out.print("iterator: ");
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();




        // create a list of Strings
        List<String> shoppingList = new ArrayList<>();

        // add elements to the list
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        // print the elements using toString() method
        System.out.println("Using toString() method: " + shoppingList.toString());

        // print the elements using a for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();

        // print the elements using an enhanced for loop
        System.out.print("Using enhanced for loop: ");
        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // print the elements using an iterator
        System.out.print("Using iterator: ");
        Iterator<String> Iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // remove the element "bread" from the list
        shoppingList.remove("bread");

        // print the elements again
        System.out.println("After removing \"bread\": " + shoppingList.toString());

        // remove the element at index 2
        shoppingList.remove(2);

        // print the elements again
        System.out.println("After removing element at index 2: " + shoppingList.toString());


       
        
        // create a list of Strings
        List<String> ShoppingList = new ArrayList<>();

        // add elements to the list
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        // create a new list using the values of the shoppingList
        List<String> newShoppingList = new ArrayList<>(shoppingList);

        // add elements to the new list
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        // print the elements of the new list
        System.out.println("Elements of the new list: " + newShoppingList.toString());

        // check if "tea" exists in the new list and print an appropriate message
        if (newShoppingList.contains("tea")) {
            System.out.println("The element \"tea\" exists in the new list.");
        } else {
            System.out.println("The element \"tea\" does not exist in the new list.");
        }





        // create a new LinkedList
        LinkedList<String> newLinkedList = new LinkedList<>();

        // add elements to the list
        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        // create a newShoppingList as in the previous example
        List<String> ShoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        // add all the elements of the newShoppingList to the newLinkedList
        newLinkedList.addAll(newShoppingList);

        // remove the first element of the list and print the list
        newLinkedList.removeFirst();
        System.out.println("After removing the first element: " + newLinkedList.toString());

        // remove the last element of the list and print the list
        newLinkedList.removeLast();
        System.out.println("After removing the last element: " + newLinkedList.toString());
    }
}



 

