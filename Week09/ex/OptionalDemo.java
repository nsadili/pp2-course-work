import java.util.StringTokenizer;

public class OptionalDemo {

    public static String findWordWithPrefix(String prefix, String text) {
        StringTokenizer a = new StringTokenizer(text);
        while (a.hasMoreTokens()) {
            String word = a.nextToken();
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                return word;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
        System.out.println(findWordWithPrefix("sa", "salam menim adim Nerimandir"));
    }
}
