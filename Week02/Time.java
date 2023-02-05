import java.util.Scanner;

public class Time {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int h = n/3600;
        int hh = n%3600;
        int m = hh/60;
        int s = hh%60;

        System.out.printf("%02d:%02d:%02d", h, m, s);

    }
}