public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime a = new CustomTime(1,2,3);
        System.out.println(a.toUniversalString());
        System.out.println(a.toStandardString());
    }
}
