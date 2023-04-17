package Week04.Array;

public class ExplodedString {
    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i+1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Baku";
        String explodedStr = explodeString(str);
        System.out.println(explodedStr); // prints "BBaBakBaku"
    }
}
