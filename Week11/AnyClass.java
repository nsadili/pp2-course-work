package Week11;


public class AnyClass {
    public static void main(String[] args) {
        AnyFunc<String> reverseFunc = (s) -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
            };

            System.out.println(reverseFunc.func("Salam"));
    
            AnyFunc<Integer> countDigitsFunc = (n) -> {
                return String.valueOf(n).length();
                };
                System.out.println(countDigitsFunc.func(3423));
    }
}
