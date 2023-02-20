public class ExplodedString {
    public static String explode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.substring(0, i+1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Baku";
        String explodedStr = explode(str);
        System.out.println(explodedStr);
    }
}
