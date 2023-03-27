import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsInAction {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(9);
    list1.add(3);
    list1.add(1);
    list1.add(0);

    System.out.println(list1);

    for (int i : list1) {
      System.out.print(i + " ");
    }

    System.out.println();

    Iterator<Integer> iterator = list1.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

    System.out.println();

    List<String> shoppingList = new ArrayList<>();

    shoppingList.add("coffee");
    shoppingList.add("tea");
    shoppingList.add("bread");
    shoppingList.add("butter");
    shoppingList.add("eggs");

    System.out.println(shoppingList);

    for (String s : shoppingList) {
      System.out.print(s + " ");
    }

    System.out.println();

    Iterator<String> iterator2 = shoppingList.iterator();
    while (iterator2.hasNext()) {
      System.out.print(iterator2.next() + " ");
    }

    System.out.println();

    shoppingList.remove("bread");
    System.out.println(shoppingList);

    shoppingList.remove(2);
    System.out.println(shoppingList);

    System.out.println();

    List<String> newShoppingList = new ArrayList<>(shoppingList);

    newShoppingList.add("kiwi");
    newShoppingList.add("apple");

    System.out.println(newShoppingList);

    System.out.println("Element 'Tea' exists in the list: " + newShoppingList.contains("tea"));

    LinkedList<String> newLinkedList = new LinkedList<>();

    newLinkedList.add("tomato");
    newLinkedList.add("potato");

    newLinkedList.addAll(newShoppingList);

    newLinkedList.removeFirst();
    System.out.println(newLinkedList);

    newLinkedList.removeLast();
    System.out.println(newShoppingList);
  }
}
