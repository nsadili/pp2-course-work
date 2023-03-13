package Week03.pw4;

import Week03.pw4.objects.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(5, 10, 12);
        CustomTime time2 = new CustomTime(12,4);
        CustomTime time3 = new CustomTime(13);
        System.out.printf("\nUniversal Time 1: %s",time1.toUniversalString());
        System.out.printf("\nUniversal Time 2: %s",time2.toUniversalString());
        System.out.printf("\nUniversal Time 3: %s",time3.toUniversalString());
        System.out.printf("\nStandart Time 1: %s",time1.toStandardString());
        System.out.printf("\nStandart Time 2: %s",time2.toStandardString());
        System.out.printf("\nStandart Time 3: %s\n\n",time3.toStandardString());
    }
}
