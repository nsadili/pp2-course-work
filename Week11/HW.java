public class HW {

    public static void main(String[] args) {

        AnyFunc<String, String> reverseString = s -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        };

        AnyFunc<Integer, Integer> countDigits = n -> {
            int cnt = 0;
            while (n != 0) {
                n /= 10;
                cnt++;
            }
            return cnt;
        };

        String reversedString = reverseString.func("Salam");
        System.out.println(reversedString);

        int numberOfDigits = countDigits.func(3423);
        System.out.println(numberOfDigits);
    }

    interface AnyFunc<T, R> {
        R func(T t);
    }
}
