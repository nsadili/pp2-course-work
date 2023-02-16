public class ExplodedString {
    public static void main(String[] args) {
        String A = "Nariman";
        System.out.printf("Here is the exploded version of string: %s", explodedString(A));

    }
    public static String explodedString(String str) { //used the substring method of String here
        String exp = "";
        for (int i = 0; i < str.length(); i++) {
            exp += str.substring(0, i + 1);
        }
        return exp;
    }
}
