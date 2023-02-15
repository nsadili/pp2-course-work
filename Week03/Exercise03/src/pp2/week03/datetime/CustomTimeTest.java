package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String args[]) {
        CustomTime asd = new CustomTime(16, 2, 12);
        System.out.println(asd.toUniversalString());
        System.out.println(asd.toStandardString());
    }
}
