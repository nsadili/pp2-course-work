package pp2.week04;

public class ExplodedString {
    public static void main(String[] args) {
        String input = "Baku";
        // B Ba Bak Baku
        System.out.println(stringExploded(input));
    }

    public static String stringExploded(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                output.append(input.charAt(j));
            }
        }
        return output.toString();
    }
}
