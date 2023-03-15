public class ListDemo1 {
    public static void main(String[] args){
        
        List<String> shoppingList = new ArrayList<>();

        Collections .addAll(shoppingList
            ...elements: "coffee", "tea", "bread", "butter", "eggs");

        System.out.println(shoppingList);


        shoppingList.remove(bread);
        // System.out.println(shoppingList);

        shoppingList.remove(2);
        System.out.println("shoppingList: " + shoppingList);
        
        List<String> newShoppingList = new ArrayList<>(shoppingList);

        System.out.println("newShoppingList: " + shoppingList);
        Collections.addAll(newShoppingList, ...elements: "apple", "kiwi");
        System.out.println("newShoppingList: " + newShoppingList);

        String wordToFind = "teapot";
        //System.out.println(newShoppingList.contains(wordToFind )
        //    ? Sting.format("The new shopping list conntains <%k>", wordToFind)
        //    : Sting.format("The new shoppinng list does not contan <%k>", wordToFind);

        List<String> linkedist = new LinkedList<>();
        Collection.addAll(linkedList, ...elements: "tomato", "potato");
        linkedList.addAll(newShoppingList);

        System.out.println("linkedList " + LinkedList);
((LinkedList))inkedList.removeFirst();
System.out.prinln("linkedList: " + linkedList)
    }
}