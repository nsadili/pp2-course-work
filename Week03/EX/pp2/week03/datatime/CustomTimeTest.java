package pp2.week03.datatime;

public class CustomTimeTest {
    public static void main(String[] args){
    
    CustomTime copy = new CustomTime(0,22,30);
    CustomTime b = new CustomTime(14,22);
    System.out.println(copy.toStandartString());
    System.out.println(b.toStandartString());
    System.out.println(copy.toUniversalString());
    System.out.println(b.toUniversalString());

}
}

