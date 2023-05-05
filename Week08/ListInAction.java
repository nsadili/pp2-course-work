import java.util.*;

public class ListInAction {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(9);
        intList.add(7);
        intList.add(10);
        intList.add(13);

        printElements(intList);
        System.out.println();

        List<String> shopList = new ArrayList<String>();
        Collections.addAll(shopList, "coffee", "tea", "bread", "butter", "eggs");

        printElements(shopList);
        System.out.println();

        shopList.remove("bread");

        printElements(shopList);
        System.out.println();

        shopList.remove(2);

        List<String> newShoppingList = new ArrayList<String>(shopList);
        Collections.addAll(newShoppingList, "apple", "kiwi");

        printElements(newShoppingList);
        System.out.println();

        System.out.println(
            String.format("The list does %scontain \"tea\"",
                newShoppingList.contains("tea") ? "" : "NOT ")
        );
        System.out.println();
        
        LinkedList<String> newLinkedList = new LinkedList<String>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);

        printElements(newLinkedList);
        System.out.println();

        newLinkedList.removeFirst();
        newLinkedList.removeLast();
        
        printElements(newLinkedList);
    }

    private static <T> void printElements(List<T> line) {
        System.out.println(line.toString());

        for (int i = 0; i < line.size(); i++) System.out.print(line.get(i) + " ");
        System.out.println();

        for (T el : line) System.out.print(el + " ");
        System.out.println();

        Iterator<T> i = line.iterator();
        while (i.hasNext()) System.out.print(i.next() + " ");
        System.out.println();
    }
}