package Week11;

import java.util.function.Consumer;

public class HomeworkFunc {
    public static void main(String[] args) {
        Func<String> Function = t -> {
            StringBuilder sb = new StringBuilder();
            sb.append(t);
            sb.reverse();
            return String.valueOf(sb);

        };
        System.out.println(Func.func("Salam"));

        Func<Integer> digits = n -> {
            int cnt = 0;
            while (n > 0){
                n /= 10;
                cnt++;
            }
            return cnt;
        };
        System.out.println(digits.func(3423));
        Consumer<Integer> func2 = integer -> System.out.println(integer);
        func2
    }
}
