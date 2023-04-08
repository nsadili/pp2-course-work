import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTasksC {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        System.out.println("i. Add elements: “coffee”, “tea”, “bread”, “butter”, “eggs”");
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println("ii. Use previous methods to list all the elements of it");
        // ------------- Methods for printing ----------------Start
        System.out.println(shoppingList.toString());

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        for (String item : shoppingList) {
            System.out.println(item);
        }

        Iterator<String> iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ------------- Methods for printing ----------------END

        System.out.println("iii. Remove the element “bread” from the list");
        shoppingList.remove("bread");

        System.out.println("iv. Print the list elements again");
        System.out.println(shoppingList.toString());

        System.out.println("v. Remove the element at index 2");
        shoppingList.remove(2);
        System.out.println(shoppingList.toString());
    }
}
