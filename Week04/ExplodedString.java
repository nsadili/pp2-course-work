import java.util.*;
import java.lang.Math;
public class ExplodedString {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String st = sc.nextLine();
            String[] split = st.split("");
            StringBuilder stb = new StringBuilder();
            for (String s : split) {
                stb.append(s);
                String join = stb.toString();
                System.out.print(join);
            }
        }
}
