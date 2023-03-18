package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInAction {

	public static void main(String[] args) {

		List<String> shoppingList = new ArrayList<>();

		shoppingList.add("coffee");
		shoppingList.add("tea");
		shoppingList.add("bread");
		shoppingList.add("butter");
		shoppingList.add("eggs");

		Iterator<String> iterator = shoppingList.iterator();

		while (iterator.hasNext()) {

			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		shoppingList.remove("bread");

		System.out.println("********");

		// print the elements using toString() method
		// remove the element at index 2
		// print the elements using toString() method

		System.out.println(shoppingList.toString());

		shoppingList.remove(2);

		System.out.println("********");

		System.out.println(shoppingList.toString());

		// Create a new list named newShoppingList using the values of the shoppingList
		// Print the elements of newShoppingList
		// Check if "tea" exists in newShoppingList and print an appropriate message

		System.out.println("********");

		ArrayList<String> shoppingList1 = new ArrayList<String>();

		shoppingList1.add("banana");
		shoppingList1.add("orange");
		shoppingList1.add("bread");

		ArrayList<String> newShoppingList = new ArrayList<>(shoppingList1);

		newShoppingList.add("apple");
		newShoppingList.add("kiwi");

		System.out.println("Elements in newShoppingList:");

		for (String element : newShoppingList) {

			System.out.println(element);
		}

		if (newShoppingList.contains("tea"))
			System.out.println("Tea is in the new shopping list.");
		else
			System.out.println("Tea is not in the new shopping list.");

		System.out.println("********");

		LinkedList<String> newLinkedList = new LinkedList<>();

		newLinkedList.add("tomato");
		newLinkedList.add("potato");

		// create a new LinkedList named newShoppingList
		LinkedList<String> newShoppingList1 = new LinkedList<String>();

		newShoppingList1.add("apple");
		newShoppingList1.add("banana");
		newShoppingList1.add("orange");

		newLinkedList.addAll(newShoppingList1);

		newLinkedList.removeFirst();
		System.out.println("After removing the first element: " + newLinkedList);

		newLinkedList.removeLast();
		System.out.println("After removing the last element: " + newLinkedList);

	}
}
