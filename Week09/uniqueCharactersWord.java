import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class uniqueCharactersWord {

    private static Map<String, Set<Character>> cache = new TreeMap<>();
    public static void main(String[] args) {
        // String str = String.join(" ", args);
        String str1 = "hello";
        String str2 = "rufat";
        String str3 = "shaaamiiil";
        String str4 = "rufat";
        String str5 = "hellllo";

        System.out.println(uniqueChars(str1));
        System.out.println(uniqueChars(str2));
        System.out.println(uniqueChars(str3));
        System.out.println(uniqueChars(str4));
        System.out.println(uniqueChars(str5));
    }

    public static void testAWord (String str){
        long time1=System.currentTimeMillis();
        System.out.println(uniqueChars(str));
        long time2=System.currentTimeMillis();
        System.out.println("Time ellapsed: "+(time2-time1));
    }

    public static Set<Character> uniqueChars(String str){
        if (cache.containsKey(str)) System.out.printf("%s returning from the cache:\n", str);

        else{
            Set<Character> set = new HashSet<>();
    
            for (char ch : str.toCharArray()){
                set.add(ch);
            }
            cache.put(str, set);
            return set;
        }
        return cache.get(str);
        
    }
}
