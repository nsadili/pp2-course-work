package week008.codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> my_list = new ArrayList<>();

		my_list.add(10);
		my_list.add(20);
		my_list.add(30);
		my_list.add(40);

		System.out.println(my_list.toString());

		// --------------

		for (int i = 0; i < my_list.size(); i++) {

			System.out.println(my_list.get(i) + " ");

		}
		System.out.println("--------");

		for (Integer my_int : my_list) {
			System.out.println(my_int);
		}

		System.out.println("--------");

		Iterator<Integer> it = my_list.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + " ");

		}

		System.out.println();

		System.out.println("--------");

		List<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("coffee");
		shoppingList.add("tea");
		shoppingList.add("bread");
		shoppingList.add("butter");
		shoppingList.add("eggs");

		System.out.println(shoppingList.toString());

		System.out.println("--------");

		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.print(shoppingList.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("--------");

		shoppingList.remove(2);

		System.out.println(shoppingList.toString());
		
		System.out.println("--------");
		
		shoppingList.remove(2);
		
		System.out.println(shoppingList.toString());
		
		System.out.println("--------");
		
		List<String> newShoppingList = new ArrayList<>(shoppingList);
        
		newShoppingList.add("apple");
        newShoppingList.add("kiwi");
		
		System.out.println(newShoppingList.toString());
		
		System.out.println("--------");
		
		if (newShoppingList.contains("tea")) {
			
			System.out.println("Tea is in the list");
			
		} else {
			
			System.out.println("Tea is not in the list");
			
		}
		
		System.out.println("--------");
		
		LinkedList<String> newLinkedList = new LinkedList<>();
        
		newLinkedList.add("tomato");
		newLinkedList.add("potato");
		
		System.out.println(newLinkedList.toString());
		
		System.out.println("--------");
		
		newLinkedList.addAll(newShoppingList);
		
		System.out.println(newLinkedList.toString());
		
		System.out.println("--------");
		
		newLinkedList.remove(0);
		newLinkedList.remove(5);
		
		System.out.println(newLinkedList.toString());
		
	}

}
