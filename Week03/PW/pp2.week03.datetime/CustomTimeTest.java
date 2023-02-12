public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime fullTime = new CustomTime(10, 23, 15);
        CustomTime onlyHourTime = new CustomTime(10);
        CustomTime timeWithoutSeconds = new CustomTime(10, 23);
        CustomTime zeroTime = new CustomTime();
        
        System.out.println();
        fullTime.toUniversalString("Full time:", fullTime);
        onlyHourTime.toUniversalString("Only hour time:", onlyHourTime);
        timeWithoutSeconds.toStandardString("Time without seconds:", timeWithoutSeconds);
        zeroTime.toStandardString("Zero time:", zeroTime);
        System.out.println();
    }
}