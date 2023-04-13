package Week11;


public class HW1_Reverse {
    public static void main(String[] args) {
        ReverseStr rv = (String s) -> new StringBuilder(s).reverse().toString();

        String reversedStr = rv.reverse("first");
        System.out.println(reversedStr);

        DigitCounter dc = (int n) -> {
            int cnt = 0;
            while(n>0){
                n /= 10;
                cnt++;
            }
            return cnt;
        };
        System.out.println(dc.count(555));
    }
}

@FunctionalInterface
interface ReverseStr {
    String reverse(String str);
}


@FunctionalInterface
interface DigitCounter{
    int count(int num);
}