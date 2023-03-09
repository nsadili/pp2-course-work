package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(23, 30, 15);
        CustomTime time2 = new CustomTime();
        CustomTime time3 = new CustomTime(12);
        CustomTime time4 = new CustomTime(8, 45);
        CustomTime time5 = new CustomTime(time1);

        System.out.println("time1: " + time1.toUniversalString() + " / " + time1.toStandardString());
        System.out.println("time2: " + time2.toUniversalString() + " / " + time2.toStandardString());
        System.out.println("time3: " + time3.toUniversalString() + " / " + time3.toStandardString());
        System.out.println("time4: " + time4.toUniversalString() + " / " + time4.toStandardString());
        System.out.println("time5: " + time5.toUniversalString() + " / " + time5.toStandardString());
    }
}
