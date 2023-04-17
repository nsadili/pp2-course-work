package Week11;
//import java.util.function.Function;

// public class HW {
//     public static void main(String[] args) {
//         String input = "Salam";
//         Function<String, String> reverseStr = (String str) -> new StringBuilder(str).reverse().toString();
//         String reversedStr = reverseStr.apply(input);
//         System.out.println("Input string: " + input);
//         System.out.println("Reversed string: " + reversedStr);

//         int num = 3423;
//         Function<Integer, Integer> count = (Integer n) -> String.valueOf(n).length();
//         int numDigits = count.apply(num);
//         System.out.println("Number: " + num);
//         System.out.println("Number of digits: " + numDigits);

//     }
// }


public class HW {
    public static void main( String[] args){
        AnyFunc<String> func = a -> {
            StringBuilder n=new StringBuilder();
          n.append(a);
          n.reverse();
          return String.valueOf(n);
        };
        AnyFunc<Integer> digits = t -> {
           int cnt;
            while (t > 0){
                t/=10;
                cnt++;
            }
            return cnt;
        };
        System.out.println(digits.func(0));
    }
}









