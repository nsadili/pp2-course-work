import java.util.ArrayList;

public class ListTasksD {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("banana");
        shoppingList.add("orange");
        shoppingList.add("grapes");

        System.out.println("i. Add elements: “apple”, “kiwi”");
        ArrayList<String> newShoppingList = new ArrayList<String>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println("ii. Print the elements");
        for (String item : newShoppingList) {
            System.out.println(item);
        }

        System.out.println("iii. Check if the element “tea” exists in the newShoppingList print an appropriate");
        if (newShoppingList.contains("tea")) {
            System.out.println("The element 'tea' exists in the newShoppingList");
        } else {
            System.out.println("The element 'tea' does not exist in the newShoppingList");
        }
    }
}
