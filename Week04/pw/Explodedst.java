
public class Explodedst {
    public static String getExplodedst(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= input.length(); i++) {
            sb.append(input.substring(0, i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "Baku";
        String exploded = getExplodedst(input);
        System.out.println(exploded);
    }
}



