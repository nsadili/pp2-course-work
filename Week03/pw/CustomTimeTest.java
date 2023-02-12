public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(8, 15, 30);
        System.out.println("Time1 in universal format: " + time1.toUniversalString());
        System.out.println("Time1 in standard format: " + time1.toStandardString());

        CustomTime time2 = new CustomTime();
        System.out.println("Time2 in universal format: " + time2.toUniversalString());
        System.out.println("Time2 in standard format: " + time2.toStandardString());

        CustomTime time3 = new CustomTime(17);
        System.out.println("Time3 in universal format: " + time3.toUniversalString());
        System.out.println("Time3 in standard format: " + time3.toStandardString());

        CustomTime time4 = new CustomTime(12, 45);
        System.out.println("Time4 in universal format: " + time4.toUniversalString());
        System.out.println("Time4 in standard format: " + time4.toStandardString());

        CustomTime time5 = new CustomTime(time1);
        System.out.println("Time5 in universal format: " + time5.toUniversalString());
        System.out.println("Time5 in standard format: " + time5.toStandardString());
    }
}
