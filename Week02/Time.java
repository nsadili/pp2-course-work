import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int minute = (second/60)%60;
        int hour = second/3600;
        System.out.print("Hour: " + hour + " Minute: " + minute + " Second: " + second%60);
        
    }
}
