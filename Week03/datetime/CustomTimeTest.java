package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(8, 45, 20);
        CustomTime time2 = new CustomTime(1, 13);
        CustomTime time3 = new CustomTime(7);
        CustomTime time4 = new CustomTime();
        CustomTime time5 = new CustomTime(time1);

        System.out.println("time1: " + time1.toUniversalString() + " " + time1.toStandardString());
        System.out.println("time2: " + time2.toUniversalString() + " " + time2.toStandardString());
        System.out.println("time3: " + time3.toUniversalString() + " " + time3.toStandardString());
        System.out.println
    }}