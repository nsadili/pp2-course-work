package Week09;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class Characteroccurrences {
    public static void main(String[] args) {
        String S=args[0].toLowerCase();

        Map<Character, List<Integer>> charOccurence= new TreeMap<>(new Comparator<Character>() {
            public int compare(Character o1,Character o2){
                return o2-o1;
            }
        });

   
    for(int i=0; i<S.length(); i++) {
        Character c=S.charAt(i);

        if(!(charOccurence.containsKey(c))){
           List<Integer> list= new ArrayList<>();
           list.add(i);
           charOccurence.put(c, list);

        }
        else charOccurence.get(c).add(i);
    }


for(var key : charOccurence.keySet())
System.out.println(key +": " + charOccurence.get(key));

System.out.println("end");

    }
}
