package Week11;

public class AnyFuncHW {
    public static void main(String[] args) {
        AnyFunc<String> func = t -> {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.reverse();
            return String.valueOf(sb);
        };
        System.out.println(func.func("Salam"));

        AnyFunc<Integer> digits = n -> {
            int cnt = 0;
            while (n > 0){
                n/=10;
                cnt++;
            }
            return cnt;
        };

        System.out.println(digits.func(1231234));
    }
}