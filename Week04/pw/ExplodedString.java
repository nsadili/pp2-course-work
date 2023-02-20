public class ExplodedString {
    public static void main(String[] args) {
        String input = "Baku";
        String exploded = getExplodedString(input);
        System.out.println("Exploded string: " + exploded);
    }
    
    public static String getExplodedString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
