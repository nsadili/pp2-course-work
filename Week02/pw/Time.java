//package Week02.pw;
import java.util.Scanner;

public class Time{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int clockHour = sec/3600;
        int clockSec = sec%60;
        int clockMin = (sec%3600)/60;
        System.out.printf("%02d:%02d:%02d", clockHour, clockMin, clockSec);
    }
}