package ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Set<Character>> map = new HashMap<>();
        System.out.println("Enter 'e' to exit.\nPlease, enter the input:");
        while (true) {
            String str = scan.nextLine();
            if(str.equals("e")){
                break;
            }
            if (!(map.containsKey(str))) {
                map.put(str, uniqueChar(str));
                System.out.println("First time to print:");
                System.out.println("Unique characters:"+map.get(str));

            } else{
                map.get(str);
                System.out.println("Retrieved from cathe:");
                System.out.println("Unique characters:"+map.get(str));
            }

        }
      
    }

    static Set<Character> uniqueChar(String str) {
        Set<Character> res = new TreeSet<>();
        for (char e : str.toCharArray()) {
            res.add(e);
        }
        return res;
    }
}
