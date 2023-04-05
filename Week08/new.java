package Week08;
import java.util.*;

public class new{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>() ;

        nums.add(10) ;
        nums.add(5) ;
        nums.add(3) ;
        nums.add(1) ;
        
       System.out.println(nums);
       for(int i=0 ; i<nums.size() ; i++) 
       System.out.println(nums.get(i) + " ");
       System.out.println();

       for(Integer el : nums) {
        el = el + 10 ;
        System.out.println(el + " ");
        System.out.println();
       }
        System.out.println(nums);
    Iterator<Integer> it = nums.iterator() ;
    if(!it.hasNext()) 
        System.out.println("[]");
    
    while(it.hasNext())
    System.out.println(it.next()+ " ");
      System.out.println();
    

List<String> shoppingList = new ArrayList<>() ;

Collections.addAll(shoppingList,"coffee", "tea", "bread", "butter", "eggs") ;
System.out.println(shoppingList) ;
shoppingList.remove("bread") ;
shoppingList.remove(2) ;
System.out.println("New shopping list includes: " + shoppingList) ;


List<String> newShoppingList = new ArrayList<>(shoppingList) ;
Collections.addAll(shoppingList,"kiwi", "apple") ;
System.out.println("new shopping list: " + newShoppingList) ;
System.out.println(newShoppingList.contains("tea")) ;

List<String> linkedList = new LinkedList<>() ;
Collections.addAll(linkedList, "tomato", "potato") ;
linkedList.addAll(newShoppingList) ;
System.out.println("linked list: " + linkedList);
((LinkedList<String>)linkedList).removeFirst(); 

((LinkedList<String>)linkedList).removeLast(); 
System.out.println("linked list: " + linkedList);
List<Integer> numList = new ArrayList<>() ;
Collections.addAll(numList, 1, 2, 3, 4, 5) ;

Collections.sort(numList) ;

System.out.println(numList);

}
}
