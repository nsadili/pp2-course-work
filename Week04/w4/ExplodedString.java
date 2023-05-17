public class ExplodedString {

    public static void main(String[] args) {
        String str = "Hello";
        String exploded = explodeString(str);
        System.out.println(exploded);
    }

    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(repeatChar(c, i + 2));
        }
        return sb.toString();
    }

    public static String repeatChar(char c, int a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}