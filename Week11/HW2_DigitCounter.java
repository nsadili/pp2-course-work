package Week11;
import java.util.Scanner;
public class HW2_DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        DigitCounter dc = (int n) -> {
            int cnt = 0;
            while(n>0){
                n /= 10;
                cnt++;
            }
            return cnt;
        };
        System.out.println(dc.count(num));
    }
}

@FunctionalInterface
interface DigitCounter{
    int count(int num);
}
