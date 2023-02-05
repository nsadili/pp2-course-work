import java.util.*;
import java.lang.Math;
public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0)
            if(n%400!=0 && n%100==0)System.out.print("Not leap year");
            else System.out.print("Leap year");
        else System.out.print("Not leap year");
    }
}
