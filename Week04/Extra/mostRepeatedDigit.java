package Week04.Extra;

public class mostRepeatedDigit {
    public static void main(String[] args) {
        int number = 2224521;
        int maxCount = 0;
        int mostRepeatedDigit = -1;
        int currentDigit, currentCount;
        while (number > 0) {
            currentDigit = number % 10;
            currentCount = 0;
            int tmp = number;
            while (tmp > 0) {
                if (tmp % 10 == currentDigit) {
                    currentCount++;
                }
                tmp /= 10;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostRepeatedDigit = currentDigit;
            }
            number /= 10;
        }
        System.out.println( mostRepeatedDigit);
    }
}
    

