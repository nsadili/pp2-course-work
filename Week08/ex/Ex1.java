import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(8);
        nums.add(4);
        nums.add(1);

        // System.out.println(nums.get(2));
        System.out.println(nums);
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        List<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);
        shoppingList.remove("bread");
        System.out.println(shoppingList);
        shoppingList.remove(2);
        System.out.println(shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        System.out.println(newShoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println(newShoppingList);
        String checkedword="tea";
        if(newShoppingList.contains(checkedword)) System.out.printf("List contains <%s>\n", checkedword);
        else System.out.printf("List does not contain <%s>\n", checkedword);

        List<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomato","potato");
        newLinkedList.addAll(newShoppingList);
        System.out.println(newLinkedList);
        ((LinkedList)newLinkedList).removeFirst();
        System.out.println(newLinkedList);
        ((LinkedList)newLinkedList).removeLast();
        System.out.println(newLinkedList);







    }
}
