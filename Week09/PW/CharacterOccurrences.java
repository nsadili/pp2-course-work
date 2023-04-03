public class StringIndex {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Give me a String as a command line argument");
            return;
        }

        String input = args[0];
        int l = input.length();
        Map<Character, List<Integer>> charIndexMap = new TreeMap<>();

        for (int i = 0; i < l; i++) {
            char c = input.charAt(i);
            charIndexMap.putIfAbsent(c, new ArrayList<>());
            charIndexMap.get(c).add(i);
        }

        System.out.println("Character in ascending order");
        for (Map.Entry<Character, List<Integer>> entry : charIndexMap.entrySet()) {
            char ch = entry.getKey();
            List<Integer> indices = entry.getValue();
            for (int index : indices) {
                System.out.println(ch + index);
            }
        }

        System.out.println("Character in descending order");
        for (Map.Entry<Character, List<Integer>> entry : charIndexMap.descendingMap().entrySet()) {
            char ch = entry.getKey();
            List<Integer> indices = entry.getValue();
            for (int index : indices) {
                System.out.println(ch + index);
            }
        }
    }
    /* We have an input "My name is Asgar"
    Firstly, we will get characters in ascending order ( A M a e g i m n r s y)
    Then, in descending order (y s r n m i g e A s M)
     */
}