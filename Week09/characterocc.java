import java.util.*;

public class characterocc {
    public static void main(String[] args) {
        
        String inputString = args[0];

        
        Map<Character, List<Integer>> Ascending = new TreeMap<>();

        
        Map<Character, List<Integer>> Descending = new TreeMap<>(Collections.reverseOrder());

        
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

    
            List<Integer> indexListAscending = Ascending.getOrDefault(c, new ArrayList<>());
            indexListAscending.add(i);
            Ascending.put(c, indexListAscending);

    
            List<Integer> indexListDescending = Descending.getOrDefault(c, new ArrayList<>());
            indexListDescending.add(i);
            Descending.put(c, indexListDescending);
        }

    
        System.out.println(" ascending order:");
        for (Map.Entry<Character, List<Integer>> entry : Ascending.entrySet()) {
            char c = entry.getKey();
            List<Integer> indexList = entry.getValue();
            System.out.println(c + " : " + indexList);
        }


        System.out.println(" descending order:");
        for (Map.Entry<Character, List<Integer>> entry : Descending.entrySet()) {
            char c = entry.getKey();
            List<Integer> indexList = entry.getValue();
            System.out.println(c + " : " + indexList);
        }
    }
}
