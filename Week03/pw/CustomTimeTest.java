import pp2.w3.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
       
        CustomTime time = new CustomTime(6, 5, 56);
        System.out.println("Universal " + time.toUniversalString());
        System.out.println("Standard " + time.toStandardString());
    }
}
