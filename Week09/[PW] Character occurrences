public class StringIndexPrinter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No string provided as a command line argument.");
            return;
        }

        String str = args[0];
        int len = str.length();
        char[] chars = str.toCharArray();

        // Print the characters of the string and their indexes
        System.out.println("Characters and their indexes in the string:");
        for (int i = 0; i < len; i++) {
            System.out.println(chars[i] + " at index " + i);
        }

        // Print the characters and their indexes in non-descending order
        System.out.println("\nCharacters and their indexes in non-descending order:");
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < len; i++) {
                if (chars[i] == c) {
                    System.out.println(chars[i] + " at index " + i);
                }
            }
        }

        // Print the characters and their indexes in non-ascending order
        System.out.println("\nCharacters and their indexes in non-ascending order:");
        for (char c = 'z'; c >= 'a'; c--) {
            for (int i = 0; i < len; i++) {
                if (chars[i] == c) {
                    System.out.println(chars[i] + " at index " + i);
                }
            }
        }
    }
}
