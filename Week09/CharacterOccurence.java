import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurence {
    public static void main(String[] args) {
        String test = args[0].toLowerCase();

      //  Map<Character, Integer> occurence = new TreeMap<>();  // non-descending order
        Map<Character, Integer> occurence = new TreeMap<>(new Comparator<Character>() {

            @Override
            public int compare(Character o1, Character o2) {
                return o2-o1;
            }
            
        });  // non-ascending order

        
        for(var i=0;i<test.length();i++){

            Character ch = test.charAt(i);
            if(!(occurence.containsKey(ch))) occurence.put(ch, 1);
            else{
             var num = occurence.get(ch);
             occurence.put(ch, ++num);
            }

        }

        for(var key: occurence.keySet()){
            System.out.println(key + ": " + occurence.get(key));
        }
    }
}
