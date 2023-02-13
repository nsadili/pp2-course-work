public class CustomTimeTest {
    public static void main(String []argv) {
        // Initializing class with default constructor
        CustomTime ctime = new CustomTime(14, 54, 43);

        // System.out.println(ctime.toUniversalString());

        // Class to clone ctime class
        CustomTime sTime = new CustomTime(ctime);

        ctime.setHour(5);
        // Showing that time can be shown in STANDART format after using setter
        System.out.println(ctime.toStandartString());

        // Showing time in UNIVERSAL format
        System.out.println(ctime.toUniversalString());
        // Showing time in STANDART format
        System.out.println(sTime.toStandartString());
    }
}