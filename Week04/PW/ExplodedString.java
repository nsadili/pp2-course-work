public class ExplodedString {
    public static String explodeString(String str) {
        StringBuilder exp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            exp.append(str.charAt(i)).append(str.charAt(i));
        }
        return exp.toString();
    }

    public static void main(String[] args) {
        String str = "Baku";
        String exploded_str = exploded_string(str);
        System.out.println(exploded_str);
    }
}