package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(3);
        CustomTime time3 = new CustomTime(3, 41);
        CustomTime time4 = new CustomTime(22, 32, 57);
        CustomTime time5 = new CustomTime(time4);

        System.out.println("Time 1: " + time1.toUniversalString());
        System.out.println("Time 2: " + time2.toUniversalString());
        System.out.println("Time 3: " + time3.toUniversalString());
        System.out.println("Time 4: " + time4.toUniversalString());
        System.out.println("Time 5: " + time5.toUniversalString());
        System.out.println();
        System.out.println("Time 1: " + time1.toStandardString());
        System.out.println("Time 2: " + time2.toStandardString());
        System.out.println("Time 3: " + time3.toStandardString());
        System.out.println("Time 4: " + time4.toStandardString());
        System.out.println("Time 5: " + time5.toStandardString());
    }
}
