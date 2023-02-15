package Week03.datetime;
import java.util.Scanner;

class CustomTime{
    int hour, minute, second;

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime(){
    }

    public CustomTime(int hour){
        this.hour = hour;
    }

    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void toUniversalString(CustomTime time){
        System.out.println(time.hour + ":" + time.minute + ":" + time.second);
    }

    public void toStandardString(CustomTime time){
        if(hour < 13)
            System.out.println(time.hour + ":" + time.minute + ":" + time.second + " AM");
        else
            System.out.println(time.hour - 12 + ":" + time.minute + ":" + time.second + " PM");
    }

}
public class CustomTimeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hour = input.nextInt();
        System.out.print("Enter minutes: ");
        int minute = input.nextInt();
        System.out.print("Enter seconds: ");
        int second = input.nextInt();
        input.close();

        CustomTime time = new CustomTime(hour, minute, second);

        CustomTime time2 = new CustomTime();

        CustomTime time3 = new CustomTime(hour);

        CustomTime time4 = new CustomTime(hour, minute);

        CustomTime time5 = new CustomTime(time4);

        time.toUniversalString(time);

        time.toStandardString(time);

    }
}
