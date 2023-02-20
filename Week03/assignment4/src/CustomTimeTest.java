import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(15, 30, 45);
        CustomTime time3 = new CustomTime(12);
        CustomTime time4 = new CustomTime(time2);

        System.out.println("Time 1: " + time1.toUniversalString());
        System.out.println("Time 2: " + time2.toStandardString());
        System.out.println("Time 3: " + time3.toUniversalString());
        System.out.println("Time 4: " + time4.toStandardString());

        time1.setTime(23, 59, 59);
        System.out.println("New Time 1: " + time1.toUniversalString());
    }
}
