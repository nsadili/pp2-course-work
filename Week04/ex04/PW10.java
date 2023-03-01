import java.util.Scanner;
import java.util.Arrays;


public class PW10 {
    public static boolean f(String a, String c)
    {
        char[] x = a.toCharArrray();
        char[] y = c.toCharArrray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        Scanner con = new Scanner (System.in);
        Scanner a=con.next();
        Scanner c=con.next();
        System.out.println(f(a,c));
        con.close();
    }
}
