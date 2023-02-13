
public class  CustomTimeTest {
    public static void main(String[] args) {
      CustomTime time1 = new CustomTime();
      System.out.println("Time 1 (default constructor): " + time1.toUniversalString());
      
      CustomTime time2 = new CustomTime(1);
      System.out.println("Time 2 (one-parameter constructor): " + time2.toUniversalString());
      
      CustomTime time3 = new CustomTime(2, 30);
      System.out.println("Time 3 (two-parameter constructor): " + time3.toUniversalString());
      
      CustomTime time4 = new CustomTime(3, 40, 50);
      System.out.println("Time 4 (three-parameter constructor): " + time4.toUniversalString());
    }
}