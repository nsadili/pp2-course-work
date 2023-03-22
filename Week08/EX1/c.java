package Week08.EX1;

import java.util.ArrayList;
import java.util.Iterator;

public class c {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");


        System.out.println(shoppingList.toString());

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        Iterator<String> it = shoppingList.iterator();

        while(it.hasNext()){
          System.out.print(it.next() + " ");
        }
        System.out.println();

        shoppingList.remove("bread");
        System.out.println(shoppingList);

        shoppingList.remove(2);

    }
    
}