import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
            int time=sc.nextInt();
            int hour=time/3600;
            int minutes=(time-(3600*hour))/60;
            int seconds=time-(3600*hour)-minutes*60;
        System.out.println(hour+":"+minutes+":"+seconds);


        //Write a program that given a number that represents seconds, converts it to
    //hours, minutes, and seconds. (Use Scanner or command-line arguments)

    }
}