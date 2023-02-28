public class ExplodedString {
    public static void main(String[] args) {

        String str = "Baku";

        System.out.println(explodedString(str));
    }

    public static String explodedString(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i + 1));
        }

        return sb.toString();
    }
}