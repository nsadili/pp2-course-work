package pp2.week03.datetime;
import java.util.*;
public class CustomTimeTest {
    public static void main(String args[])
    {
        Scanner scn = new Scanner (System.in);
        CustomTime t = new CustomTime (22, 44, 50);
        System.out.print(t.toStandardString());
       
    }
}