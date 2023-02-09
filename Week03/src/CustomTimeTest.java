import datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time = new CustomTime(13, 37, 2);

        System.out.println(time.toStandardString());
    }
}
