package Week11;

import java.util.function.Consumer;

public class HomeworkOfAnyFunc {
    public static void main(String[] args) {
        AFunc<String> func = t -> {
            char[] characters = t.toCharArray();
            String res = "";
            for (int i = characters.length - 1; i >= 0; i--) {
                res += characters[i];
            }
            return res;
        };
        System.out.println(func.func("Salam"));

        AFunc<Integer> digits = a -> {
            int cnt = 0;
            while (a > 0){
                a /= 10;
                cnt++;
            }
            return cnt;
        };

        System.out.println(digits.func(0));

        Consumer<Integer> func2 = integer -> System.out.println(integer);

        func2.accept(3564);

    }
}