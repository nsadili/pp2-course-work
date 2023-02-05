import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Please write seconds!");
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int hour = second/3600;
        int hourR = second%3600;
        int minute = hourR/60;
        int minuteR = hourR%60;
        
        System.out.printf("%d hours, %d minutes, %d seconds", hour, minute, minuteR);
        
    }
}