public class ExplodedString{
    public static String explodeString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append("He");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String explodedStr = explodeString(str);
        System.out.println(explodedStr);
    }
}
