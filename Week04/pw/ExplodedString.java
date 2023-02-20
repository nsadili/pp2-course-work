public class ExplodedString {
    public static void main(String[] args) {
        String input = "Baku";
        String exploded = explodeString(input);
        System.out.println(exploded); 
    }

    public static String explodeString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            // char c = input.charAt(i);
            // for (int j = 0; j <= i; j++) {
            //     sb.append(c);
            // }
            input.substring(0,i++);
        }
        return sb.toString();
    }
}
