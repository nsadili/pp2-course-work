package pp2.week11;
import java.util.*;
public class MinMaxLambda {
    interface operation
    {
        int operation(int a, int b);
    }

    public static void main (String [] args)
    {
        Scanner scn = new Scanner(System.in);
        operation max = (int a, int b) -> (a>b) ? a:b;
        operation min = (int a, int b) -> (a<b) ? a:b;
        int a = 8;
        int b = 18;
System.out.println(min);
    }

}
