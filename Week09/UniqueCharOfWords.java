import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to exit");
        Map<String, List<Character>> cache = new HashMap<>();

        while (true) {
            System.out.println("Please enter the input:");

            String test = sc.nextLine();
            if (test.equals("0"))
                break;
            if (!(cache.containsKey(test))) {
                cache.put(test, findUniqe(test));
                System.out.println("First time Call");
                System.out.println(findUniqe(test));
            } else {
                System.out.println("Call from Cache");
                System.out.println(cache.get(test));
            }

        }

    }

    static List<Character> findUniqe(String test) {

        List<Character> uniqueList = new ArrayList<>();
        List<Character> nonUniqe = new ArrayList<>();

        for (var ch : test.toCharArray()) {
            if (!(uniqueList.contains(ch)))
                uniqueList.add(ch);
            else {
                nonUniqe.add(ch);
            }
        }

        uniqueList.removeAll(nonUniqe);

        return uniqueList;
    }
}