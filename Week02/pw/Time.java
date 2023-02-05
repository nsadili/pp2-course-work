import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int hours=a/3600;
        int minutes=(a-3600*hours)/60;
        int seconds=a-(hours*3600+minutes*60);
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
