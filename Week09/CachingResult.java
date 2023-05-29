import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CachingResult {
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            Map<String, Map<Character, Integer>> cache = new LinkedHashMap<>();
            System.out.println("Enter 1 to exit");
            do {
                System.out.println("Enter Input Parametr");
                String test= scn.nextLine();
                if(test.equals("0")) break;
               
                if(!(cache.containsKey(test))){
                    System.out.println("i");
                    cache.put(test, mostLeastCharacter(test));
                    print(mostLeastCharacter(test));
                }
   
                else{
                    var list = cache.get(test);
                    System.out.println("+");
                    print(list);
                }
                System.out.println("");
                
            } while (true);
        }
 
    }

    static void print(String test){
        var list = mostLeastCharacter(test);
        System.out.println("-");
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

    static void print(Map<Character, Integer> list){
       
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
        Map<Character , Integer> list = new LinkedHashMap<>();

        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        var numOfChar = findNumberOfCharacter(test);

        for(var key : numOfChar.keySet()){
            if(key.equals(' ')) continue;
            if(numOfChar.get(key) >= max ) max = numOfChar.get(key);
            if(numOfChar.get(key) <= min) min= numOfChar.get(key);
        }

        for(var key : numOfChar.keySet()){
            if(numOfChar.get(key) == max ) list.put(key, 1);
            if(numOfChar.get(key) == min) list.put(key, -1);
        }

        return list;

    }

    static Map<Character, Integer> findNumberOfCharacter(String test){

        Map<Character, Integer> numOfChar = new LinkedHashMap<>();

        for(var i = 0; i < test.length();i++){

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