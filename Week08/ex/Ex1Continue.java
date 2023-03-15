import java.util.*;

public class Ex1Continue {
    public static void main(String[] args) {
        
        List<String> shoppingList = new ArrayList<>();
        
        Collections.addAll(shoppingList, "coffee", "tea", "bread", "butter", "eggs");
        System.out.println(shoppingList);

        shoppingList.remove("bread");
        System.out.println(shoppingList);

        shoppingList.remove(2);
        System.out.println(shoppingList);

        List<String> newShoppingList = new ArrayList<>(shoppingList);

        System.out.println(newShoppingList);

        newShoppingList.add("kiwi");
        newShoppingList.add("apple");

        System.out.println(newShoppingList.contains("teapot")
        ? "The new shopping list contains <teapot>."
        : "The new shopping list does not contain <teapot>!!!");

        // or you can do it like ...

        String wordToFind = "teapot";
        System.out.println(newShoppingList.contains(wordToFind)
        ? String.format("The new shopping list contains <teapot>.", wordToFind)
        : String.format("The new shopping list does not contain <%s>!!!", wordToFind));


        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "tomato", "potato");
        linkedList.addAll(newShoppingList);

        System.out.println("Linkedlist: " + linkedList);

        ((LinkedList<String>)linkedList).removeFirst();
        System.out.println("Linkedlist: " + linkedList);

        ((LinkedList<String>)linkedList).removeLast();
        System.out.println("Linkedlist: " + linkedList);


    }
}
