package pp23.week03.customtime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime t1 = new CustomTime(23, 59, 59);
        CustomTime t2 = new CustomTime(t1);
        CustomTime t3 = new CustomTime(12, 30);
        CustomTime t4 = new CustomTime(8);
        CustomTime t5 = new CustomTime();

        System.out.printf("t1: %s%n", t1.toUniversalString());
        System.out.printf("t2: %s%n", t2.toStandardString());
        System.out.printf("t3: %s%n", t3.toUniversalString());
        System.out.printf("t4: %s%n", t4.toStandardString());
        System.out.printf("t5: %s%n", t5.toUniversalString());

        t1.setHour(12);
        t1.setMinute(0);
        t1.setSecond(0);
        System.out.printf("t1: %s%n", t1.toStandardString());
    }
}