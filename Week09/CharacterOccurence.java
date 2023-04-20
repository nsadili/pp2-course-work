import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurence {
    public static void main(String[] args) {
        String test = String.join(" ", args);
        test= test.toLowerCase();        
        
            
      //  Map<Character, List<Integer>> occurence = new TreeMap<>();  // non-descending order
        Map<Character, List<Integer>> occurence = new TreeMap<>(new Comparator<Character>() {

            @Override
            public int compare(Character o1, Character o2) {
                return o2-o1;
            }
            
        });  // non-ascending order

        
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

        for(var key: occurence.keySet()){
            System.out.println(key + ": " + occurence.get(key));
        }
        System.out.println("End");
    }
}