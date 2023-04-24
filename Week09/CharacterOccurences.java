public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String inputString = args[0];

        // Print characters and their indexes in alphabetically non-descending order
        System.out.println("Characters and their indexes (alphabetically non-descending order):");
        char[] charArray = inputString.toCharArray();
        java.util.Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.println("Character: " + c + ", Index: " + inputString.indexOf(c));
        }

        // Print characters and their indexes in alphabetically non-ascending order
        System.out.println("\nCharacters and their indexes (alphabetically non-ascending order):");
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            System.out.println("Character: " + c + ", Index: " + inputString.indexOf(c));
        }
    }
}
