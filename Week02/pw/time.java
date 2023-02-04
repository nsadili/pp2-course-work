import java.util.Scanner;
public class time{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int seconds = obj.nextInt();
        int hours =0;
        int minutes =0;
            hours = seconds / 3600;
            seconds -= hours*3600;
            minutes = seconds/60;
            seconds -= minutes*60;
            System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
    }
}