package pp2.week03.datetime;
import pp2.week03.datetime.*;
import java.util.*;
public class CustomTimeTest {
    public static void main(String args[])
    {
        Scanner scn = new Scanner (System.in);
        CustomTime time = new CustomTime (11, 23, 33);
        System.out.print (time.toStandardString());
    }
}
