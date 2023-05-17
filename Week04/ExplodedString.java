public class ExplodedString {
    public static void main(String[] args) {
        String input = "Baku";
        String exploded = explodeString(input);
        System.out.println("Exploded string: " + exploded);
    }

    public static String explodeString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(currentChar);
            }
        }
        
        return stringBuilder.toString();
    }
}
