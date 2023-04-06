public class CustomTimeTest {
    public static void main(String[] args){

       CustomTime time1 = new CustomTime();
       CustomTime time2 = new CustomTime(5, 25, 34);
       CustomTime time3 = new CustomTime(9);

       System.out.println(time1.toStandardString());
       System.out.println(time2.toStandardString());
       System.out.println(time3.toUniversalString());
    }
}
