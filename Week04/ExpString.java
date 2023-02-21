public class ExpString {
    public static String exp(String string) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            strb.append(string.charAt(i));
            strb.append(string.substring(0, i+1));
        }
        return strb.toString();
    }

    public static void main(String[] args) {
        String string = "Aghdam";
        String explodedStr = exp(string);
        System.out.println(explodedStr);
    }
}