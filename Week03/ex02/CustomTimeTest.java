public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime t = new CustomTime();

        t.setHour(4);
        t.setMinute(50);
        t.setSecond(32);
        t.toUniversalString();
        t.toStandardString();

        System.out.println("Universal format: " + t.toUniversalString());
        System.out.println("Standard format: " + t.toStandardString());
    }
    
}
