import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsInAction {
 public static void main(){

    List<Integer> intList = new ArrayList<Integer>();
intList.add(1);
intList.add(2);
intList.add(3);
intList.add(4);

System.out.println(intList.toString());

for (int i = 0; i < intList.size(); i++) {
    System.out.println(intList.get(i));
}

for (int num : intList) {
    System.out.println(num);
}

Iterator<Integer> it = intList.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

List<String> shoppingList = new ArrayList<String>();
shoppingList.add("coffee");
shoppingList.add("tea");
shoppingList.add("bread");
shoppingList.add("butter");
shoppingList.add("eggs");

System.out.println(shoppingList.toString());

shoppingList.remove("bread");

System.out.println(shoppingList.toString());

shoppingList.remove(2);

List<String> newShoppingList = new ArrayList<String>(shoppingList);
newShoppingList.add("apple");
newShoppingList.add("kiwi");

System.out.println(newShoppingList.toString());

if (newShoppingList.contains("tea")) {
    System.out.println("Tea exists in the new shopping list");
} else {
    System.out.println("Tea does not exist in the new shopping list");
}

LinkedList<String> newLinkedList = new LinkedList<String>();
newLinkedList.add("tomato");
newLinkedList.add("potato");

newLinkedList.addAll(newShoppingList);

newLinkedList.removeFirst();
newLinkedList.removeLast();

System.out.println(newLinkedList.toString());

 }
 
}   
