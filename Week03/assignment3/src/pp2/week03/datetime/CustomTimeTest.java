package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(12, 30, 45);
        CustomTime time2 = new CustomTime();
        CustomTime time3 = new CustomTime(8);
        CustomTime time4 = new CustomTime(17, 45);

        System.out.println("Time 1 (Universal): " + time1.toUniversalString());
        System.out.println("Time 1 (Standard): " + time1.toStandardString());
        System.out.println("Time 2 (Universal): " + time2.toUniversalString());
        System.out.println("Time 2 (Standard): " + time2.toStandardString());
        System.out.println("Time 3 (Universal): " + time3.toUniversalString());
        System.out.println("Time 3 (Standard): " + time3.toStandardString());
        System.out.println("Time 4 (Universal): " + time4.toUniversalString());
        System.out.println("Time 4 (Standard): " + time4.toStandardString());
    }
}