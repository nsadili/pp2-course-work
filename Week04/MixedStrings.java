import java.util.*;

public class MixedStrings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String st = sc.nextLine();
        String[] split = st.split(" ");
        StringBuilder stb = new StringBuilder();

        for (String s : split) {
            int i=s.length()-1;
            char[] ch = s.toCharArray();
            char temp = ch[0];
            ch[0] = ch[ch.length - 1];
            ch[ch.length - 1] = temp;
            String result = new String(ch);
            stb.append(result).append(" ");
        }
        String join = stb.toString();
        System.out.println(join);
    }
}
