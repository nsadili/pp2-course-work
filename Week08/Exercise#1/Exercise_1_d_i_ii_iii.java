import java.util.ArrayList;
import java.util.Iterator;

public class Exercise_1_d_i_ii_iii {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        
        shoppingList.remove(2);
        
        System.out.println(shoppingList.toString());

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();

        for (String num : shoppingList) {
            System.out.print(num + " ");
        }

        Iterator<String> iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        ArrayList<String> NewShoppingList = new ArrayList<>();
        
        NewShoppingList.add("coffee");
        NewShoppingList.add("tea");
        NewShoppingList.add("butter");
        NewShoppingList.add("eggs");
        NewShoppingList.add("apple");
        NewShoppingList.add("kiwi");
    
        System.out.println(NewShoppingList.toString());

    }
}

//"tea" is given in an appropriate way
