public class RepeatedDigit {
    public static void main(String[] args) {
        int a = 3315;
        int temp = 0;
        int cnt = 0;
        while(a<0) {
            int digit = a%10;
            if(a!=temp) temp = a;
            else if (a==temp)
            a /= 10;
        }
    }
}
