public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(12, 20, 0);
        CustomTime time3 = new CustomTime(12);
        CustomTime time4 = new CustomTime(12, 20);
        CustomTime time5 = new CustomTime(time2);

        System.out.println("Time 1 (default constructor): " + time1.toStandardString());
        System.out.println("Time 2 (12, 20, 0): " + time2.toStandardString());
        System.out.println("Time 3 (12): " + time3.toStandardString());
        System.out.println("Time 4 (12, 20): " + time4.toStandardString());
        System.out.println("Time 5 (copy of time2): " + time5.toStandardString());
    }
}



