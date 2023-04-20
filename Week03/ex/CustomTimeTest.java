import pp2.week3.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {

        CustomTime t3 = new CustomTime(12, 00, 00);

        CustomTime t = new CustomTime(12, 3, 45);
        CustomTime t2 = new CustomTime(17, 36);

        CustomTime copy = new CustomTime(t);

        System.out.println(copy.getHour() + "," + copy.getMin());

        String s = t3.toUniversalString();
        System.out.println(s);
        System.out.println(t3.toStandartString());

        System.out.println(t2.toUniversalString());

        System.out.println(t.toStandartString());

        System.out.println(t.getHour());

        System.out.println(t2.getSec());

    }

}