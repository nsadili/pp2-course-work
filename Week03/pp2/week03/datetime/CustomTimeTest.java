package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args){
        CustomTime timeRN = new CustomTime(5, 5);

        System.out.println(timeRN.toUniversalString());
        System.out.println(timeRN.toStandardString());
    }
}
