package practicalwork;

import java.util.function.Consumer;

public class HwOfAnyFunction {
	
    public static void main(String[] args) {
    	
        AnyFunc<String> func = t -> {
            char[] characters = t.toCharArray();
            String res = "";
            for (int i = characters.length - 1; i >= 0; i--) {
                res += characters[i];
            }
            return res;
        };
        
        System.out.println(func.func("Salam"));
        AnyFunc<Integer> digits = n -> {
            int cnt = 0;
            while (n > 0){
                n /= 10;
                cnt++;
            }
            return cnt;
        };
        
        System.out.println(digits.func(0));
        Consumer<Integer> func2 = integer -> System.out.println(integer);
        func2.accept(3564);
        
    }
}