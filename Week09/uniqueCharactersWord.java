import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class uniqueCharactersWord {

    private static Map<String, Set<Character>> cache = new TreeMap<>();
    public static void main(String[] args) {
        // String str1 = "hello";
        // String str2 = "rufat";
        // String str3 = "shaaamiiil";
        // String str4 = "rufat";
        // String str5 = "hellllo";

        // testAWord(str1);
        // testAWord(str2);
        // testAWord(str3);
        // testAWord(str4);
        // testAWord(str5);

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            testAWord(sc.next());
        }

        sc.close();

    }

    public static void testAWord (String str){
        long time1=System.nanoTime();
        System.out.println(uniqueChars(str));
        long time2=System.nanoTime();
        System.out.println("Time ellapsed: "+(time2-time1));
        System.out.println();
    }

    public static Set<Character> uniqueChars(String str){
        str=str.toLowerCase();
        if (cache.containsKey(str)) System.out.printf("<%s> returning from the cache:\n", str);

        else{
            Set<Character> set = new HashSet<>();
    
            for (char ch : str.toCharArray()){
                set.add(ch);
            }
            cache.put(str, set);
            // return set;
        }
        return cache.get(str);
        
    }
}
