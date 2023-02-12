public class CustomTimeTest
{
    public static void main(String[] args)
    {
        CustomTime time1 = new CustomTime(15, 25, 45);
        CustomTime time2 = new CustomTime(12);
        CustomTime time3 = new CustomTime(10, 34);

        System.out.println("Time1 in universal format: " + time1.toUniversalString());
        System.out.println("Time1 in standard format: " + time1.toStandardString());
        System.out.println("Time2 in universal format: " + time2.toUniversalString());
        System.out.println("Time2 in standard format: " + time2.toStandardString());
        System.out.println("Time3 in universal format: " + time3.toUniversalString());
        System.out.println("Time3 in standard format: " + time3.toStandardString());
    }
}