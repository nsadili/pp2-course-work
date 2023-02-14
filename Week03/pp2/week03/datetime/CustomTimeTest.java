package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(); 
        CustomTime time2 = new CustomTime(15, 30, 45); 
        CustomTime time3 = new CustomTime(10); 
        CustomTime time4 = new CustomTime(23, 45);
        CustomTime time5 = new CustomTime(time2); 
        System.out.printf("time1: %s\n", time1.toUniversal());
        System.out.printf("time2: %s\n", time2.toUniversal());
        System.out.printf("time3: %s\n", time3.toUniversal());
        System.out.printf("time4: %s\n", time4.toUniversal());
        System.out.printf("time5: %s\n", time5.toUniversal());
        System.out.printf("time2 in universal format: %s\n", time2.toUniversal());
        System.out.printf("time4 in universal format: %s\n", time4.toUniversal());
        System.out.printf("time3 in standard format: %s\n", time3.toStandart());
        System.out.printf("time4 in standard format: %s\n", time4.toStandart());
    }

    
}
