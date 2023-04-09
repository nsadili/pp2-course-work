import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str= args[0].toLowerCase();

        Map<Character, List<Integer>> characters= new TreeMap<>( new Comparator<Character>(){// using TreeMap will be best option because of alpabetical order
            @Override
            public int compare(Character o1,Character o2){
                return o2-o1; 
            }
        });

        for(int i=0; i<str.length();i++){
            Character ch= str.charAt(i);
            if(!(characters.containsKey(ch))){
               List<Integer> list= new ArrayList<>();
               list.add(i);
               characters.put(ch, list);
            } else{
                characters.get(ch).add(i);
            }

        }

        
        for(var key : characters.keySet()){
            System.out.println(key +" is index of at: "+ characters.get(key));
        }
    }
    
}