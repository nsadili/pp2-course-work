import java.util.Scanner;
public class Time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sec = input.nextInt();
        int min = 0;
        int hour = 0;
        int def = 0 ;
        def=sec;
        if(sec>=60 & sec<3600) {
        min=def/60;
        sec=def-min*60;
        }
        else if(sec>=3600) {
        hour=def/60/60;
        min=(def-hour*60*60)/60;
        sec=def-hour*60*60-min*60;
        }
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}