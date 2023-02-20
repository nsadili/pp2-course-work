package Strings;

public class ex11 {
    public static void main(String args[]) {
        String str = "This is a test run";
        System.out.println(mixString(str));
    }

    public static StringBuilder mixString(String s) {
        String str[] = s.split(" ", 0);
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            StringBuilder word = new StringBuilder(str[i]);
            String letter = "";
            if (word.length() > 1) {
                char first = word.charAt(0);
                word.replace(0, 1, letter + word.charAt(word.length() - 1));
                word.replace(word.length() - 1, word.length(), letter + first);
            }
            newString.append(word);
            if (i != str.length - 1)
                newString.append(" ");
        }
        return newString;
    }
}
