package pp2.week03.datetime;

public class CustomTimeTest {
        public static void main(String[] args) {
            CustomTime time = new CustomTime(7, 18, 46);
    
            System.out.println(time.toUniversalString());
            System.out.println(time.toStandardString());
        }
    }
