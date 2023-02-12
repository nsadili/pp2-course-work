import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime CT1 = new CustomTime(13,2,3);
        CustomTime CT2 = new CustomTime(1);
        CustomTime CT3 = new CustomTime(23,10);

        System.out.printf("It is our time with Universal String with HMS: %s\n", CT1.toUniversalString());
        System.out.printf("It is our time with Universal String with H: %s\n", CT2.toUniversalString());
        System.out.printf("It is our time with Universal String with HM: %s\n\n", CT3.toUniversalString());

        System.out.printf("It is our time with Standart String with HMS: %s\n", CT1.toStandartString());
        System.out.printf("It is our time with Standart String with H: %s\n", CT2.toStandartString());
        System.out.printf("It is our time with Standart String with HM: %s\n\n", CT3.toStandartString());

        System.out.printf("HOUR 1: %d hour(s)\n", CT1.getHour());
        System.out.printf("HOUR 2: %d hour(s)\n", CT2.getHour());
        System.out.printf("HOUR 3: %d hour(s)\n\n", CT3.getHour());

        System.out.printf("MINUTE 1: %d minute(s)\n", CT1.getMinute());
        System.out.printf("MINUTE 2: %d minute(s)\n", CT2.getMinute());
        System.out.printf("MINUTE 3: %d minute(s)\n\n", CT3.getMinute());

        System.out.printf("SECOND 1: %d second(s)\n", CT1.getSecond());
        System.out.printf("SECOND 2: %d second(s)\n", CT2.getSecond());
        System.out.printf("SECOND 3: %d second(s)\n", CT3.getSecond());
    }
}