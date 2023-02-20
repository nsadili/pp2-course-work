package pp2.week04.strings;
import java.util.*;
public class Slices {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String string = scn.nextLine();
        int cnt=0;
        int length = string.length();
        String res = " ";

        for (int j = 0; j < length; j++) {
            res+=' ';
        }
        for (int i = 0; i < length ; i++) {
            res = res.substring(0,i)+string.charAt(cnt++)+" "+string.substring(i+1,length);
            System.out.println(res);
        }
    }
}
