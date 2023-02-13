import pp2.week03.datatime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(12, 30, 45);
        System.out.println("Original time: " + time1.toUniversalString());
        System.out.println("Standard time: " + time1.toStandardString());
        System.out.println();

        CustomTime time2 = new CustomTime();
        System.out.println("Original time: " + time2.toUniversalString());
        System.out.println("Standard time: " + time2.toStandardString());
        System.out.println();

        CustomTime time3 = new CustomTime(12);
        System.out.println("Original time: " + time3.toUniversalString());
        System.out.println("Standard time: " + time3.toStandardString());
        System.out.println();

        CustomTime time4 = new CustomTime(12, 30);
        System.out.println("Original time: " + time4.toUniversalString());
        System.out.println("Standard time: " + time4.toStandardString());
        System.out.println();

        CustomTime time5 = new CustomTime(time1);
        System.out.println("Original time: " + time5.toUniversalString());
        System.out.println("Standard time: " + time5.toStandardString());
    }
}
