package datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time = new CustomTime(14,54);
        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());
    }
}