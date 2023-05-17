public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime fullTime = new CustomTime(15, 21, 12);
        CustomTime onlyHoursTime = new CustomTime(15);
        CustomTime timeWithoutSeconds = new CustomTime(15, 21);
        CustomTime zeroTime = new CustomTime();
        
        System.out.println();
        fullTime.toUniversalString("Full time:", fullTime);
        CustomTime onlyHourTime;
        onlyHourTime.toUniversalString("Only hours time:", onlyHourTime);
        timeWithoutSeconds.toStandardString("Time without seconds:", timeWithoutSeconds);
        zeroTime.toStandardString("Zero time:", zeroTime);
        System.out.println();
    }
}