public class Exploded {
    public static void main(String[] args) {
        String s = "Baku";
        String exploded = explodeString(s);
        System.out.print(exploded); 
    }

    public static String explodeString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(0, i + 1);
            sb.append(substr);
        }

        return sb.toString();
    }
}
