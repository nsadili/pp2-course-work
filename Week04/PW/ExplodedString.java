public class ExplodedString {
    public static String explodeString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
