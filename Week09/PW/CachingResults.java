package PW;

import java.util.HashMap;
import java.util.HashSet;

public class CachingResults {
    public static void main(String[] args){
        HashMap<String, HashMap<String, HashSet<Character>>> cache = new HashMap<>();


        long s = System.nanoTime();
        System.out.println(mostAndLeastCharacter("Salamlar", cache));
        long e = System.nanoTime();
        System.out.println("Time Taken for initial processing:" + (e-s));

        s = System.nanoTime();
        System.out.println(mostAndLeastCharacter("Salamlar", cache));
        e = System.nanoTime();
        System.out.println("Time Taken for getting from cache:" + (e-s));
    }

    static HashMap<String, HashSet<Character>> mostAndLeastCharacter(String word, HashMap<String, HashMap<String, HashSet<Character>>> cache){
        if(cache.containsKey(word)){
            return cache.get(word);
        }else{
        HashMap<String, HashSet<Character>> mostLeast = new HashMap<>();
        mostLeast.put("Most", new HashSet<Character>());
        mostLeast.put("Least", new HashSet<Character>());
        int mostCount = 0;
        int leastCount = word.length();
        for(int i=0;i<word.length();i++){
            int tempCount = 0;
            for(int ii=0;ii<word.length();ii++){
                if(word.charAt(i) == word.charAt(ii)){
                    tempCount++;
                }
            }
            if(tempCount>mostCount){
                mostCount = tempCount;
            }
            if(tempCount<leastCount){
                leastCount = tempCount;
            }
        }

        for(int i=0;i<word.length();i++){
            int tempCount =0;
            for(int ii=0;ii<word.length();ii++){
                if(word.charAt(i)==word.charAt(ii)){
                    tempCount++;
                }
            }
            if(tempCount==mostCount){
                mostLeast.get("Most").add(word.charAt(i));
            }
            if(tempCount==leastCount){
                mostLeast.get("Least").add(word.charAt(i));
            }
        }
        cache.put(word, mostLeast);
        return mostLeast;
    }
    } 
}
