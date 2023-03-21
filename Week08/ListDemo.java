package Week08;

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
Collections.addAll(linkedList, );
linkedList.addAll(newShoppingList);
System.out.println("LinkedList: " + linkedlist);

linkedList.remove(0);
linkedList.remove(0);

     }  
}
