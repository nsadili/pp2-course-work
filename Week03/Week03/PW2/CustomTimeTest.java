public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(11, 26, 35);
        System.out.println("time1 (universal): " + time1.toUniversalString());
        System.out.println("time1 (standard): " + time1.toStandardString());
    
        CustomTime time2 = new CustomTime();
        System.out.println("time2 (universal): " + time2.toUniversalString());
        System.out.println("time2 (standard): " + time2.toStandardString());
    
        CustomTime time3 = new CustomTime(12);
        System.out.println("time3 (universal): " + time3.toUniversalString());
        System.out.println("time3 (standard): " + time3.toStandardString());
    }
}
