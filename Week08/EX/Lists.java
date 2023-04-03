import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<Integer>();

        // add elements to the list
        myIntList.add(10);
        myIntList.add(20);
        myIntList.add(30);

        // using toString() method
        System.out.println("Using toString() method:");
        System.out.println(myIntList.toString());

        // using for statement
        System.out.println("\nUsing for statement:");
        for (int i = 0; i < myIntList.size(); i++) {
            System.out.println(myIntList.get(i));
        }

        // using enhanced for statement
        System.out.println("\nUsing enhanced for statement:");
        for (int element : myIntList) {
            System.out.println(element);
        }

        // using iterator
        System.out.println("\nUsing iterator:");
        Iterator<Integer> iterator = myIntList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


            List<String> shoppingList = new ArrayList<String>();

            // add elements to the list
            shoppingList.add("coffee");
            shoppingList.add("tea");
            shoppingList.add("bread");
            shoppingList.add("butter");
            shoppingList.add("eggs");

            // using toString() method
            System.out.println("Using toString() method:");
            System.out.println(shoppingList.toString());

            // using for statement
            System.out.println("\nUsing for statement:");
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println(shoppingList.get(i));
            }

            // using enhanced for statement
            System.out.println("\nUsing enhanced for statement:");
            for (String element : shoppingList) {
                System.out.println(element);
            }

            // using iterator
            System.out.println("\nUsing iterator:");
            Iterator<String> iterator1 = shoppingList.iterator();
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }

            // remove an element
            shoppingList.remove("bread");

            // print the list again
            System.out.println("\nAfter removing \"bread\":");
            System.out.println(shoppingList.toString());

            // remove an element at index 2
            shoppingList.remove(2);

            // print the list again
            System.out.println("\nAfter removing element at index 2:");
            System.out.println(shoppingList.toString());


            List<String> newShoppingList = new ArrayList<String>(shoppingList);

            // add new elements to the new list
            newShoppingList.add("apple");
            newShoppingList.add("kiwi");

            // print the elements of the new list
            System.out.println("New Shopping List:");
            for (String element : newShoppingList) {
                System.out.println(element);
            }

            // check if "tea" exists in the new list
            if (newShoppingList.contains("tea")) {
                System.out.println("The new shopping list contains tea.");
            } else {
                System.out.println("The new shopping list does not contain tea.");
            }

            List<String> newLinkedList = new LinkedList<String>();

            // add elements to the new list
            newLinkedList.add("tomato");
            newLinkedList.add("potato");

            // add all elements of newShoppingList to the new list
            List<String> newShoppingList1 = new LinkedList<String>();
            newShoppingList1.add("coffee");
            newShoppingList1.add("tea");
            newShoppingList1.add("bread");
            newShoppingList1.add("butter");
            newShoppingList1.add("eggs");
            newShoppingList1.add("apple");
            newShoppingList1.add("kiwi");

            newLinkedList.addAll(newShoppingList);

            // remove the first element of the list
            ((LinkedList<String>) newLinkedList).removeFirst();
            System.out.println("New Linked List after removing first element: " + newLinkedList);

            // remove the last element of the list
            ((LinkedList<String>) newLinkedList).removeLast();
            System.out.println("New Linked List after removing last element: " + newLinkedList);
        }
        }

    }
