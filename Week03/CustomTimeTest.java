package Week03;

public class CustomTimeTest {
    public static void main(String[] args) {
       
        CustomTime time = new CustomTime(5, 10, 20);
        System.out.println("Hour " + time.getHour());
        System.out.println("Minute " + time.getMinute());
        System.out.println("Second " + time.getSecond());
        System.out.println("Universal " + time.toUniversalString());
        System.out.println("Standard " + time.toStandardString());
        
       

    }
}