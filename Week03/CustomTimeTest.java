import java.util.Scanner;

import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CustomTime time = new CustomTime();
        time.setHour(scan.nextInt());
        time.setMin(scan.nextInt());
        time.setSec(scan.nextInt());
        System.out.println(time.getMin());
        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());
    }
}
