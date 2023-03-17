import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInAction {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(10);
        myList.add(3);
        myList.add(6);

        myList.remove(1);
        myList.remove(Integer.valueOf(1));

        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++)
        System.out.print(myList.get(i) + " ");
        System.out.println();

        for (Integer el : myList) // read only
        System.out.print(el + " ");
        System.out.println();

        Iterator<Integer> it = myList.iterator();
        if (!it.hasNext())
        System.out.println("[]");

        while (it.hasNext()) {
        System.out.print(it.next() + " ");
        }
        System.out.println();

        List<String> shoppingList = new ArrayList<>();

        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");

        // System.out.println(shoppingList);

        shoppingList.remove("bread");
        // System.out.println(shoppingList);

        shoppingList.remove(2);
        System.out.println(shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        Collections.addAll(shoppingList, "apple", "kiwi");
        System.out.println("NeShoppingList: " + newShoppingList);

        String wordToFind = "tea";
        System.out.println(newShoppingList.contains(wordToFind)
        ? String.format("The new shoppingList contains <%s>", wordToFind)
        : String.format("The new shoppingList doesn't contain <%s>", wordToFind));

        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);

        System.out.println("linkedList" + linkedList);

        ((LinkedList<String>) (linkedList)).removeFirst();
        System.out.println("linkedList" + linkedList);



        ((LinkedList<String>) (linkedList)).removeLast();
        System.out.println("linkedList" + linkedList);




    }
}