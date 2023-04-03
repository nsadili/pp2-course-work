package Week08.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppongList {
    public static void main(String[] args) {
        List<String> shoppinglist = new ArrayList<>();
        Collections.addAll(shoppinglist, "coffee", "tea", "bread", "butter", "eggs");
        shoppinglist.remove("bread");
        shoppinglist.remove(2);
        System.out.println("shoppinglist: " + shoppinglist);
        List<String> newShopingList = new ArrayList<>(shoppinglist);
        Collections.addAll(newShopingList, "apple", "kiwi");
        System.out.println("newshoppinglist: " + newShopingList);
        String wordToFind ="tea";
        System.out.println(
            newShopingList.contains(wordToFind)
            ? String.format("The word <%s> exist", wordToFind)
            : String.format("The word <%s> do not exist", wordToFind)
        );
    }
}
