package pp2.week4;

public class Ex08 {
    public static String explodeString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if (i != input.length() - 1) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }    
}