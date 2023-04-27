public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(14, 30, 45);
        System.out.println("Time 1 in universal format: " + time1.toUniversalString());
        System.out.println("Time 1 in standard format: " + time1.toStandardString());
        
        CustomTime time2 = new CustomTime(6, 15);
        System.out.println("Time 2 in universal format: " + time2.toUniversalString());
        System.out.println("Time 2 in standard format: " + time2.toStandardString());
        
        CustomTime time3 = new CustomTime(21);
        System.out.println("Time 3 in universal format: " + time3.toUniversalString());
        System.out.println("Time 3 in standard format: " + time3.toStandardString());
        
        CustomTime time4 = new CustomTime(time1);
        System.out.println("Time 4 in universal format: " + time4.toUniversalString());
        System.out.println("Time 4 in standard format: " + time4.toStandardString());
    }
}
