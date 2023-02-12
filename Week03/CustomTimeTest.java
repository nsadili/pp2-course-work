package Ex04;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(23, 30, 45);
        CustomTime time2 = new CustomTime(9, 15);
        CustomTime time3 = new CustomTime(14);
        CustomTime time4 = new CustomTime();
        CustomTime time5 = new CustomTime(time1);

        System.out.println(time1.toUniversalString());
        System.out.println(time2.toStandardString()); 
        System.out.println(time3.toUniversalString());
        System.out.println(time4.toStandardString()); 
        System.out.println(time5.toUniversalString()); 
    }
}

