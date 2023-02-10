package CustomTime;

public class CustomTimeTest {
    public static void main(String[] args){
        CustomTime time = new CustomTime(23,34);
        System.out.println(time.getSecond());
        System.out.println(time.toStandartString());
        System.out.println(time.toUniversalString());
    }
}
