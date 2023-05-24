public class Main {
    public static boolean isPangram(String input) {
        boolean[] letters = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = Character.toLowerCase(c) - 'a';
            if (index >= 0 && index < 26) {
                letters[index] = true;
            }
        }

        for (boolean b : letters) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
