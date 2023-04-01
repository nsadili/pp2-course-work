import java.util.*;
public class CharacterOccurence {
    public static void main(String[] args) {
        String test = args[0].toLowerCase();
        Map<Character, List<Integer>> occurence = new TreeMap<>(new Comparator<Character>() {

            @Override
            public int compare(Character o1, Character o2) {
                return o2-o1;
            }
            
        }); 

        
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
