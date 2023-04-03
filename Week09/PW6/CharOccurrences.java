public class CharOccurrences {
    
    public static void main(String[] args) {
         String input = args[0];
        
         Map<Character, List<Integer>> charOccurrences = new TreeMap<>();
        
         for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!charOccurrences.containsKey(c)) {
                charOccurrences.put(c, new ArrayList<>());
            }
            charOccurrences.get(c).add(i);
        }
        
         System.out.println("Characters and their indexes in alphabetically non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charOccurrences.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<Integer> indexes = entry.getValue();
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i));
                if (i < indexes.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
         System.out.println("Characters and their indexes in alphabetically non-ascending order:");
        List<Character> characters = new ArrayList<>(charOccurrences.keySet());
        Collections.reverse(characters);
        for (char c : characters) {
            System.out.print(c + ": ");
            List<Integer> indexes = charOccurrences.get(c);
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i));
                if (i < indexes.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
