import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<String> shoppingList=new ArrayList<>();

Collections.addAll(shoppingList,"coffee", "tea", "bread", "butter", "eggs");
shoppingList.remove("bread");
shoppingList.remove(2);
    
System.out.println("ShoppingList: "+ shoppingList);


List<String> newShoppingList = new ArrayList<>(shoppingList);

newShoppingList.add("apple");
newShoppingList.add("kiwi");

System.out.println("NewshoppingList: " + newShoppingList);

//String wordToFind = "teapot";

//System.out.println(
  //  newShoppingList.contains(wordToFind)
  //? String.format("The word <%s> exists in the list\n",wordToFind)
  //:String.format("The word <%s> is NOT in the list\n",wordToFind)

//);

List<String> linkedList = new LinkedList<>();
Collections.addAll(linkedList, "tomato","potato");
linkedList.addAll(newShoppingList);

System.out.println("LinkedList: " + linkedList);

((LinkedList<String>)linkedList).removeFirst();
((LinkedList<String>)linkedList).removeLast();
System.out.println("LinkedList: " + linkedList);
    }
}