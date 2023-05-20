package Week04;

public class Exploded {
   
    public static String explodeString(String str) {
        String input = "Baku";
        String exploded = explodeString(input);
        System.out.println(exploded); 

        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            sb.append(n);
            if (i < str.length() - 1) {
                sb.append('B');
            }
        }
    
        return sb.toString();
    }
    
    
}