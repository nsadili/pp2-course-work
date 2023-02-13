import pp2.week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime t1 = new CustomTime(9);
        CustomTime t2 = new CustomTime(2, 19);
        CustomTime t3 = new CustomTime(18, 45, 37);
        CustomTime t4 = new CustomTime(t2);

        System.out.println("time 1 (standard): " + t1.toStandardString());
        System.out.println("time 2 (universal): " + t2.toUniversalString());

        System.out.println("time 3 hour:" + t3.getH());
        System.out.println("time 3 minute:" + t3.getM());
        System.out.println("time 3 second:" + t3.getS());

        System.out.println("time 4 (universal): " + t4.toUniversalString());
    
    }
}
