package Week03.CustomDate;
public class CustomTimeTest {
    public static void main (String[] args) {
    
        CustomTime time1 = new CustomTime(14,53,35);

        CustomTime time2 = new CustomTime(12,33,44);
       
        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());
        System.out.println(time1.toStandardString());
        System.out.println(time2.toStandardString());
     }

    
}