import java.util.*;
public class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sec=n%60;
        int min=n/60%60;
        int hour=n/3600;
        System.out.printf("%s:%s:%s",String.format("%02d",hour),String.format("%02d",min),String.format("%02d",sec));
    }

}
