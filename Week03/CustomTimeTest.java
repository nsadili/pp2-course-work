import pp2.week03.geometry.CustomTime;
public class CustomTimeTest {
        public static void main(String[] args) {
            CustomTime time1 = new CustomTime();
            CustomTime time2 = new CustomTime(13, 30, 30);
            CustomTime time3 = new CustomTime(13);
            CustomTime time4 = new CustomTime(13, 30);
            CustomTime time5 = new CustomTime(time2);
    
            System.out.println("Time 1 (default): " + time1.toUniversalString());
            System.out.println("Time 1 (standard): " + time1.toStandardString());
            System.out.println("Time 2 (universal): " + time2.toUniversalString());
            System.out.println("Time 2 (standard): " + time2.toStandardString());
            System.out.println("Time 3 (universal): " + time3.toUniversalString());
            System.out.println("Time 3 (standard): " + time3.toStandardString());
            System.out.println("Time 4 (universal): " + time4.toUniversalString());
            System.out.println("Time 4 (standard): " + time4.toStandardString());
           
}
}
