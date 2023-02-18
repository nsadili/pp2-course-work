package Week04;

public class StringExploded {
    public static void main(String[] args) {
        String s = "Baku";
        String exploded = explodeString(s);
        System.out.println(exploded);
    }


public static String explodeString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j <= i; j++) {
            sb.append(s.charAt(j));
        }
    }
    return sb.toString();
}

}