package Week03.datetime;

public class CustomTimeTest{
    public static void main(String[] args) {
        CustomTime CustomTime = new CustomTime(22, 2, 2);
        System.out.println(CustomTime.toUniversalString());
        System.out.println(CustomTime.toStandardString());
    }
}






