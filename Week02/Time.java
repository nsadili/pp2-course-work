import java.util.*;
public class Time {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int s = scn.nextInt();
    int minute= (s%3600)/60;
    int second= s%60;
    int hour= s/3600;
    System.out.println("" + hour+":"+minute+":"+second);
    }
}
