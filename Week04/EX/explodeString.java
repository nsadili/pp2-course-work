public class explodeString {
    public static void main(String[] args) {
        String inputString = "Baku";
        String explodedString = explodeString(inputString);
        System.out.println(explodedString);
    }

    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }
}
