package pp2.week09;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;



public class CharacterOccurrences
{
    public static void main(String[] args)
    {
        String s = args[0];
        char[] c = s.toCharArray();
        TreeMap<Character, List<Integer>> index = new TreeMap<>();
        if ( args.length > 1) {

        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            List<Integer> index2 = index.getOrDefault(ch, new ArrayList<>());
            index2.add(i);
            index.put(ch, index2);
        }

        System.out.println("non-descending order: ");
       for (Map.Entry<Character, List<Integer>> e: index.entrySet()) {

            char ch = e.getKey();
            List<Integer> index3 = e.getValue();
            System.out.print(ch + ": ");
            for (int i : index3) {
                System.out.print(i + " ");
            }
           System.out.println("non-ascending order: ");;
        }

       }
    else  {
            System.out.println("no string");

        }
    }


}


