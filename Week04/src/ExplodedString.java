public class ExplodedString {
    public static void main(String[] args) {
        System.out.println(explode("Hello"));
        
    }
    public static String explode(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j <= i; j++) {
                result += str.charAt(j);
            }
        }
        return result;
    }

    
}
