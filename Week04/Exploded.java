public class Exploded {
    public static void main(String[] args) {
        System.out.println(generateExplodedString("Baku"));
    }
    
    public static String generateExplodedString(String input) {
        String res = "";
        for(int i = 0; i <= input.length(); i++)
        {
            res += input.substring(0, i);

        }
        return res;
    }
}
