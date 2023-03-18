import java.util.LinkedList;

public class ex4 {
    public static void main(String[] args) {
        String input = "Ali, Ahmad, Islam, Samad, Ahmad, Jalil";

        String[] s = input.split(", ");

        LinkedList<String> newstr = new LinkedList<>();
        for (int i = 0; i < s.length; i++) {
            newstr.add(s[i]);
        }
        
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j])) {
                    newstr.remove(s[i]);
                }
            }
        }

        System.out.println(newstr.toString());
    }
}
