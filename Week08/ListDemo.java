package Week08;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {
  public static void main() {
    List<String> shoppingList =new ArrayList<>();
    Collections.addAll(shoppingList, "coffe", "tea", "bread", "butter", "eggs"); 
System.out.println(shoppingList);  
shoppingList.remove("bread");
shoppingList.remove(2);
System.out.println(shoppingList);
List<String> newShoppingList = new ArrayList<>();
 
//Collections.addAll();
System.out.println();
String wordToFind = "tea";
//System.out.println(newShoppingList.contains(wordToFind)
//? String.format(wordToFind)
//:String.format());

List<String> linkedList = new LinkedList<>();
Collections.addAll(linkedList, "item1", "item2", "item3" );
linkedList.addAll(newShoppingList);
System.out.println("LinkedList: " + linkedList);

linkedList.remove(0);
linkedList.remove(0);

     }  
}
