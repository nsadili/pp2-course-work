package Week04;

public class ExplodedString {
    public static String explodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "Baku";
        String output = ExplodedString.explodeString(input);
        System.out.println(output);
    }
}
