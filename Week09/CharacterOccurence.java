import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;



public class CharacterOccurence {
    public static void main(String[] args) {
        String test = args[0].toLowerCase();
        
    Map<Character, List<Integer>> occurence = new TreeMap<>(new Comparator<Character>() {

            @Override
            public int compare(Character A1, Character A2)
             {
                return A2-A1;
            }
            
        }   );

        
        for(var i=0;i<test.length();i++){

            Character ch = test.charAt(i);
            if(!(occurence.containsKey(ch))) {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                occurence.put(ch, list);
            }
            else{
             occurence.get(ch).add(i);
             
            }

        }

        for(var key: occurence.keySet())
        {
            System.out.println(key + " ;"+ occurence.get(key));
        }
        System.out.println("End");
    }
}