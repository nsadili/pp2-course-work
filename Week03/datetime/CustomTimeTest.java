package Week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(23, 59, 59);
        System.out.println("time1: " + time1.toUniversalString());
        System.out.println("time1: " + time1.toStandardString());

        CustomTime time2 = new CustomTime(12, 0, 0);
        System.out.println("time2: " + time2.toStandardString());

        CustomTime time3 = new CustomTime(5);
        System.out.println("time3: " + time3.toUniversalString());
        System.out.println("time3: " + time3.toStandardString());

        CustomTime time4 = new CustomTime(12, 01);
        System.out.println("time4: " + time4.toUniversalString());
        System.out.println("time4: " + time4.toStandardString());
    }
}
