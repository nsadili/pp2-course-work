import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
      CustomTime time1 = new CustomTime();
      CustomTime time2 = new CustomTime(10, 25, 35);
      CustomTime time3 = new CustomTime(18);
      CustomTime time4 = new CustomTime(10, 35);
      CustomTime time5 = new CustomTime(time4);
  
      System.out.println("Time 1: " + time1.toUniversalString());
      System.out.println("Time 2: " + time2.toStandardString());
      System.out.println("Time 3: " + time3.toStandardString());
      System.out.println("Time 4: " + time4.toStandardString());
      System.out.println("Time 5: " + time5.toStandardString());
    }
  }
  