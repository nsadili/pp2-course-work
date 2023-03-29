import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CachingResult {
    public static void main(String[] args) {

        String test=args[0];
       
        var list = mostLeastCharacter(test);
        System.out.println("The Least Frequented Characters");
        System.out.print("[ ");

        for(var least : list.keySet()){
            if(list.get(least).equals(-1)) System.out.print(least + " ");
        } 
        System.out.print("]");
        System.out.println("");
        System.out.println("The Most Frequented Characters");
      

        System.out.print("[ ");

        for(var least : list.keySet()){
            if(list.get(least).equals(1)) System.out.print(least + " ");  
    } 
    System.out.print("]");


    }

    static Map<Character, Integer> mostLeastCharacter(String test){
        Map<Character , Integer> list = new HashMap<>();

        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        var numOfChar = findNumberOfCharacter(test);

        for(var key : numOfChar.keySet()){
            if(numOfChar.get(key) >= max ) max= numOfChar.get(key);
            if(numOfChar.get(key) <= min) min =numOfChar.get(key);
        }

        for(var key : numOfChar.keySet()){
            if(numOfChar.get(key) == max ) list.put(key, 1);
            if(numOfChar.get(key) == min) list.put(key, -1);
        }

        return list;



    }

    static Map<Character, Integer> findNumberOfCharacter(String test){

        Map<Character, Integer> numOfChar = new LinkedHashMap<>();

        for(var i=0; i < test.length();i++){

            Character ch = test.charAt(i);

            if(!(numOfChar.containsKey(ch))){
                numOfChar.put(ch, 1);
            }else{
                var num = numOfChar.get(ch);
                numOfChar.put(ch, ++num);
            }

        }

        return numOfChar;

    }
}
