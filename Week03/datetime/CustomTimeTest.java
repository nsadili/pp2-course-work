package Week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(23, 59, 59);
        System.out.println("time1: " + time1.toUniversalString());
        System.out.println("time1: " + time1.toStandardString());

        CustomTime time2 = new CustomTime(12, 0, 0);
        System.out.println("time2: " + time2.toUniversalString());
        System.out.println("time2: " + time2.toStandardString());
    }
}
