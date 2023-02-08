package Week2;
import java.util.*;
public class Time {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long sec = sc.nextLong();
        long hour = sec/3600;
        long minute =(sec-(hour*3600))/60;
        long second = (sec-(hour*3600+minute*60));
        System.out.println(hour+" : "+minute+" : "+second);
        sc.close();
    }
}
