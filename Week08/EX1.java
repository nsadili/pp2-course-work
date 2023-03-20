import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(7);
        myList.add(3);
        myList.add(1);

        // System.out.println(myList.toString());
        
        // for (int i = 0; i < myList.size(); i++){
        //     System.out.print(myList.get(i) + " ");
        // }
        
        // for (int el: myList){
        //     el = 10 + el;
        //     System.out.print(el + " ");
        // }
        // System.out.println();
        // System.out.println(myList);

        // Iterator<Integer> it = myList.iterator();

        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        //     // remove the element if it is > 7
        // }
        // System.out.println();

        List<String> shoppinglist = new ArrayList<>();
        Collections.addAll(shoppinglist, "coffee", "tea", "bread", "butter", "eggs");
        shoppinglist.remove("bread");
        shoppinglist.remove(2);
        System.out.println("Shopping list: " + shoppinglist);
        List<String> newShoppingList = new ArrayList<>();
        Collections.addAll(newShoppingList, "apple", "kiwi");
        System.out.println("Another shopping list: " + newShoppingList);
        if (newShoppingList.contains("tea"))
            System.out.println("Shopping list contains tea.");
        else
            System.out.println("Shopping list doesn't contain tea.");
    }
}