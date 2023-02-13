package Week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {

        CustomTime time1 = new CustomTime(12, 20, 30);
        System.out.println("Time in universal format: " + time1.toUniversalString());
        System.out.println("Time in standard format: " + time1.toStandardString());
        
        
        CustomTime time2 = new CustomTime();
        System.out.println("Time in universal format: " + time2.toUniversalString());
        System.out.println("Time in standard format: " + time2.toStandardString());

        
        CustomTime time3 = new CustomTime(10);
        System.out.println("Time in universal format: " + time3.toUniversalString());
        System.out.println("Time in standard format: " + time3.toStandardString());

       
        CustomTime time4 = new CustomTime(10, 20);
        System.out.println("Time in universal format: " + time4.toUniversalString());
        System.out.println("Time in standard format: " + time4.toStandardString());

        
        CustomTime time5 = new CustomTime(time1);
        System.out.println("Time in universal format: " + time5.toUniversalString());
        System.out.println("Time in standard format: " + time5.toStandardString());
  }
}   