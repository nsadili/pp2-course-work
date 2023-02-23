package Week03.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(12, 1, 9);
        CustomTime time3 = new CustomTime(time2);
        CustomTime time4 = new CustomTime(11);
        CustomTime time5 = new CustomTime(100, 7);
        System.out.println(time1.toStandardString());
        System.out.println(time2.toStandardString());
        System.out.println(time5.toStandardString());
        System.out.println(time3.toUniversalString());
        System.out.println(time4.toUniversalString());
    }
}
