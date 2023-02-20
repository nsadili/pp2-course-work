import java.util.*;
import java.lang.Math;
public class Slices {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String st = sc.nextLine();
            int cnt=0;
            int len = st.length();
            String res = "";
            for (int j = 0; j < len; j++) {
                res+=' ';
            }
            for (int i = 0; i < len ; i++) {
                res = res.substring(0,i)+st.charAt(cnt++)+" "+st.substring(i+1,len);
                System.out.println(res);
            }
        }
    }