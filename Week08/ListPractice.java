import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("toString() method:");
        System.out.println(numbers.toString());
        System.out.println("For statement:");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("Enhanced for:");

        for(int num : numbers){
            System.out.println(num);
        }
        System.out.println("Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println(shoppingList.toString());
        for(int i=0; i<shoppingList.size(); i++){
            System.out.println(shoppingList.get(i));
        }
        for(String item : shoppingList){
            System.out.println(item);
        }
        Iterator<String> iterator2 = shoppingList.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        shoppingList.remove("bread");
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);
        System.out.println(shoppingList.toString());

        List<String> newShoppingList = new ArrayList<>();
        newShoppingList.addAll(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println(newShoppingList.toString());
        if(newShoppingList.contains("tea")){
            System.out.println("There is tea in the list");
        } else {
            System.out.println("There is no tea in the list");
        }

        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        newLinkedList.addAll(newShoppingList);
        System.out.println(newLinkedList.toString());

        newLinkedList.removeFirst();
        System.out.println(newLinkedList.toString());
        newLinkedList.removeLast();
        System.out.println(newLinkedList.toString());
    }
}
