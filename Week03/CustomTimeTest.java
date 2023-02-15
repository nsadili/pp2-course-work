package Week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time = new CustomTime(6, 17, 45);

        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());
    }
}
