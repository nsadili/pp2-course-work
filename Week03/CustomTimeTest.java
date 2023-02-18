import java.util.Scanner;

import pp2.week03.*;

public class CustomTimeTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        time.hour=scan.nextInt();
        time.min=scan.nextInt();
        time.sec=scan.nextInt();
        //System.out.println(toUniversalTime());
        //System.out.println(toStandardTime());
        System.out.println(getMin());
        
    }
}
