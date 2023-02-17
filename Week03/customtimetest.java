public class  customtimetest {
    public static void main(String[] args) {
      customtime time1 = new customtime();
      System.out.println("Time 1 (default constructor): " + time1.toUniversalString());
      
      customtime time2 = new customtime(1);
      System.out.println("Time 2 (one-parameter constructor): " + time2.toUniversalString());
      
      customtime time3 = new customtime(2, 30);
      System.out.println("Time 3 (two-parameter constructor): " + time3.toUniversalString());
      
      customtime time4 = new customtime(3, 40, 50);
      System.out.println("Time 4 (three-parameter constructor): " + time4.toUniversalString());
    }
}