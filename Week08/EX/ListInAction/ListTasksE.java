import java.util.LinkedList;

public class ListTasksE {
    public static void main(String[] args) {
        System.out.println("Create a new LinkedList named newLinkedList.");
        LinkedList<String> newLinkedList = new LinkedList<>();

        System.out.println("i. Add elements: “tomato”, “potato”");
        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        LinkedList<String> newShoppingList = new LinkedList<>();
        newShoppingList.add("apple");
        newShoppingList.add("banana");
        newShoppingList.add("carrot");

        System.out.println("ii. Add all the elements of the newShoppingList to the newLinkedList");
        newLinkedList.addAll(newShoppingList);

        System.out.println("iii. Remove the first element of the list and print the list");
        newLinkedList.removeFirst();
        System.out.println("After removing the first element: " + newLinkedList);

        System.out.println("iv. Remove the last element of the list and print the list");
        newLinkedList.removeLast();
        System.out.println("After removing the last element: " + newLinkedList);
    }
}
