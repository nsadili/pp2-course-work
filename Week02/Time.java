import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        var sec=scan.nextInt();
        System.out.printf("%02d:%02d:%02d",sec/3600,(sec-(sec/3600)*3600)/60,sec%60);
    }
}
