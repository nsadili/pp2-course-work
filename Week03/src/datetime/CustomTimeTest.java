package week03.src.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {

        CustomTime time1 = new CustomTime(12, 30, 45);
        System.out.println("Time 1 ");
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());
        System.out.println("Universal time: " + time1.toUniversalString());
        System.out.println("Standard time: " + time1.toStandardString());

        CustomTime time2 = new CustomTime();
        System.out.println("\nTime 2 ");
        System.out.println("Hour: " + time2.getHour());
        System.out.println("Minute: " + time2.getMinute());
        System.out.println("Second: " + time2.getSecond());
        System.out.println("Universal time: " + time2.toUniversalString());
        System.out.println("Standard time: " + time2.toStandardString());

        CustomTime time3 = new CustomTime(12);
        System.out.println("\nTime 3 ");
        System.out.println("Hour: " + time3.getHour());
        System.out.println("Minute: " + time3.getMinute());
        System.out.println("Second: " + time3.getSecond());
        System.out.println("Universal time: " + time3.toUniversalString());
        System.out.println("Standard time: " + time3.toStandardString());

        CustomTime time4 = new CustomTime(12, 45);
        System.out.println("\nTime 4 ");
        System.out.println("Hour: " + time4.getHour());
        System.out.println("Minute: " + time4.getMinute());
        System.out.println("Second: " + time4.getSecond());
        System.out.println("Universal time: " + time4.toUniversalString());
        System.out.println("Standard time: " + time4.toStandardString());

        CustomTime time5 = new CustomTime(time1);
        System.out.println("\nTime 5 ");
        System.out.println("Hour: " + time5.getHour());
        System.out.println("Minute: " + time5.getMinute());
        System.out.println("Second: " + time5.getSecond());
        System.out.println("Universal time: " + time5.toUniversalString());
        System.out.println("Standard time: " + time5.toStandardString());
    }
}
