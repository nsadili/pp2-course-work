import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sec = scn.nextInt();
        int hour = sec / 3600;
        int min = (sec - (hour*3600)) / 60;
        int seconds = (sec - (hour * 3600 + min * 60)) ;
        System.out.println(hour + ":" + min + ":" + seconds) ;


    }
}