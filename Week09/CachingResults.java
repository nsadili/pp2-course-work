import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class CachingResults {

    private static Map<String, Map<Character, Integer>> cache = new TreeMap<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            testAWord(sc.next());
        }

        sc.close();

    }

    public static void testAWord (String str){
        long time1=System.nanoTime();
        countChars(str);

        System.out.println(String.format("The most frequent characters of the string <%s>: ", str)
        +charMostFrequent(str));
        System.out.println(String.format("The least frequent characters of the string <%s>: ", str)
        +charLeastFrequent(str));

        long time2=System.nanoTime();
        System.out.println("Time ellapsed: "+(time2-time1));
        System.out.println();
    }

    public static List <Character> charMostFrequent(String str){
        int max=0;

        List <Character> maxChar = new ArrayList<>();
        for (var ch: str.toCharArray()){
            if(cache.get(str).get(ch)>max) max=cache.get(str).get(ch);
        }
        for (var ch: str.toCharArray()){
            if(cache.get(str).get(ch)==max && !maxChar.contains(ch)) maxChar.add(ch);
        }
        if(max==1) System.out.println("All characters are used once.");
        return maxChar;
    }

    public static List <Character> charLeastFrequent(String str){
        int min=str.length();

        List <Character> minChar = new ArrayList<>();
        for (var ch: str.toCharArray()){
            if(cache.get(str).get(ch)<min) min=cache.get(str).get(ch);
        }
        for (var ch: str.toCharArray()){
            if(cache.get(str).get(ch)==min && !minChar.contains(ch)) minChar.add(ch);
        }
        return minChar;
    }

    public static  Map <Character, Integer> countChars(String str){
        str=str.toLowerCase();
        if (cache.containsKey(str)) {
            System.out.printf("<%s> returning from the cache:\n", str);
            return cache.get(str);
        }

        else{
            Map <Character, Integer> charNums = new TreeMap<>();
    
            for (char ch : str.toCharArray()){
                if (!charNums.containsKey(ch)){
                    int value =1;
                    charNums.put(ch, value);
                }
                else {
                    int value=charNums.get(ch);
                    charNums.put(ch, value+1);
                }
            }
            cache.put(str, charNums);
            return charNums;
        }      
    }
}

