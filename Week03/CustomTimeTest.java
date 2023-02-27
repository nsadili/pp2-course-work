package Week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(5);
        CustomTime time3 = new CustomTime(5, 30);
        CustomTime time4 = new CustomTime(5, 30, 45);
        CustomTime time5 = new CustomTime(time4);

        System.out.println("Time 1 (default): " + time1.toUniversalString());
        System.out.println("Time 2 (hour only): " + time2.toUniversalString());
        System.out.println("Time 3 (hour and minute): " + time3.toUniversalString());
        System.out.println("Time 4 (hour, minute, and second): " + time4.toUniversalString());
        System.out.println("Time 5 (copy of Time 4): " + time5.toUniversalString());
    }}