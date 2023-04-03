import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    public static void main(String[] args) {
        String str= "IbrahimHuseynovvv";
        char[] c= getMostAndLeastChars(str);
        System.out.println("Most used char: "+ c[0]);
        System.out.println("Least used char: "+ c[1]);

        char[] c2= getMostAndLeastChars(str);
        System.out.println("Most used char (cached): "+ c2[0]);
        System.out.println("Least used char (cached): "+ c2[1]);
        
    }

    private static Map<String, char[]> cache= new HashMap<>();

    public static char[] getMostAndLeastChars(String s){
        if(cache.containsKey(s)){
            System.out.println("Cache...");
            return cache.get(s);
        }
        Map<Character, Integer> chars= new HashMap<>();
        for(char c: s.toCharArray()){
            if(chars.containsKey(c)){
                chars.put(c, chars.get(c)+1);
            } else{
                chars.put(c, 1);
            }
        }
        char most= ' ';
        char least= ' ';
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(char c : chars.keySet()){
            int count= chars.get(c);
            if(count> max){
                most= c;
                max= count;
            }
            if(count<min){
                least=c;
                min= count;
            }
        }
        char[] res= new char[2];
        res[0]= most;
        res[1]= least;
        cache.put(s, res);

        return res;
    }
}
    
