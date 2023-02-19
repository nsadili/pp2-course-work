package Week02.ex.hard;
public class ArmstrongNumbers {
    public static boolean isNarcissistic(int number) {
        int origNumber = number;
        int numDigits = (int) Math.log10(number) + 1;
        int sum = 0;
    
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
    
        return (sum == origNumber);
    }
}
