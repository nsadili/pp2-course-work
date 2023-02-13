import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {

    public static void main(String[] args) {

        CustomTime t1 = new CustomTime(4, 9, 4);
        System.out.println("T1 universal : " + t1.toUniversalString());
        System.out.println("T1 standard : " + t1.toStandardString());

        CustomTime t2 = new CustomTime();
        System.out.println("T2 universal : " + t2.toUniversalString());
        System.out.println("T2 standard : " + t2.toStandardString());

        CustomTime t3 = new CustomTime(4);
        System.out.println("T3 universal : " + t3.toUniversalString());
        System.out.println("T3 standard : " + t3.toStandardString());

        CustomTime t4 = new CustomTime(4, 9);
        System.out.println("T4 universal : " + t4.toUniversalString());
        System.out.println("T4 standard : " + t4.toStandardString());

        CustomTime add = new CustomTime(t1);
        System.out.println("Additional universal : " + add.toUniversalString());
        System.out.println("Additional standard : " + add.toStandardString());
    }
}
